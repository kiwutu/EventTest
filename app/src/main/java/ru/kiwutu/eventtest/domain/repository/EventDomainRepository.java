package ru.kiwutu.eventtest.domain.repository;

import androidx.lifecycle.MutableLiveData;


import ru.kiwutu.eventtest.domain.entity.event.Event;

import java.util.ArrayList;


public interface EventDomainRepository {

    MutableLiveData<ArrayList<Event>> eventGetAll();

    void eventAddNew(Event event);

    void eventDeleteById(String _id);


    void eventEditById(Event event);

    void eventEditByCategories(Event event);

    MutableLiveData<Event> eventGetById(String _id);

    MutableLiveData<Event> eventGetByCategories(String categories);

}
