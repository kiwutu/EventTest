package com.example.eventtest.data.repositoryImpl;

import android.os.AsyncTask;

import androidx.lifecycle.MutableLiveData;


import com.example.eventtest.data.db_room.dao.EventDAO;
import com.example.eventtest.data.db_room.entity.RoomEvent;
import com.example.eventtest.data.mapper.EntityMapper;
import com.example.eventtest.domain.entity.event.Event;
import com.example.eventtest.domain.repository.EventDomainRepository;

import java.util.ArrayList;
import java.util.List;


public class EventRoomRepositoryImpl implements EventDomainRepository{
    private final EventDAO eventDAO;
    private final MutableLiveData<ArrayList<Event>> listMutableLiveData;
    private final MutableLiveData<Event> eventLiveData;

    private static int autoIncrementId = 0;

    public EventRoomRepositoryImpl(EventDAO eventDAO) {
        this.eventDAO = eventDAO;
        listMutableLiveData  = new MutableLiveData<>();
        eventLiveData  = new MutableLiveData<>();
        //        updatePeopleListAsyncTask();
    }


    @Override
    public void eventAddNew(Event event) {
        AsyncTask.execute(() -> {
            RoomEvent toRoomEvent = EntityMapper.toRoomEvent(event);
            synchronized (eventDAO) {
                eventDAO.roomEventAddNew(toRoomEvent);
            }
        });
        updatePeopleListAsyncTask();
    }

    @Override
    public void eventDeleteById(String id) {
        AsyncTask.execute(() -> {
            synchronized (eventDAO) {
                eventDAO.roomEventDeleteById(id);
            }
        });
        updatePeopleListAsyncTask();
    }

    @Override
    public void eventEditById(Event event) {
        AsyncTask.execute(() -> {
            RoomEvent roomEvent = EntityMapper.toRoomEvent(
                    new Event(event.getEventInfo()));
            synchronized (eventDAO) {
                eventDAO.roomEventDeleteById(event.getId());
                eventDAO.roomEventAddNew(roomEvent);
            }
        });
        updatePeopleListAsyncTask();
    }

    @Override
    public void eventEditByCategories(Event event) {
      //TODO...
    }

    /*@Override
    public void eventEditByCategories(Event event) {
        AsyncTask.execute(() -> {
            RoomEvent roomEvent = EntityMapper.toRoomEvent(
                    new Event(event.getEventInfo()));
            synchronized (eventDAO) {
                eventDAO.roomEventDeleteById(event.getId());
                eventDAO.roomEventAddNew(roomEvent);
            }
        });
        updatePeopleListAsyncTask();
    }*/




    private void updatePeopleListAsyncTask() {
        AsyncTask.execute(() -> {
            synchronized (eventDAO) {
                List<RoomEvent> roomEventsData = eventDAO.roomEventGetAll();
                ArrayList<Event> data = new ArrayList<>();
                for (RoomEvent roomEvent : roomEventsData)
                    data.add(EntityMapper.toEvent(roomEvent));
                listMutableLiveData.postValue(new ArrayList<>(data));
            }
        });
    }


    private void findEventById(String id) {
        AsyncTask.execute(() -> {
            synchronized (eventDAO) {
                Event event = EntityMapper.toEvent(eventDAO.roomEventGetById(id));
                eventLiveData.postValue(event);
            }
        });
    }

    private void findEventByCategories(String categories) {
        AsyncTask.execute(() -> {
            synchronized (eventDAO) {
                Event event = EntityMapper.toEvent(eventDAO.roomEventGetByCategories(categories));
                eventLiveData.postValue(event);
            }
        });
    }

    @Override
    public MutableLiveData<ArrayList<Event>> eventGetAll() {
        return listMutableLiveData;
    }

    @Override
    public MutableLiveData<Event> eventGetById(String id) {
        findEventById(id);
        return eventLiveData;
    }

    @Override
    public MutableLiveData<Event> eventGetByCategories(String categories) {
        findEventByCategories(categories);
        return eventLiveData;
    }
}
