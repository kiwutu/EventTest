package com.example.eventtest.data.mapper;

import com.example.eventtest.data.db_room.entity.RoomEvent;
import com.example.eventtest.domain.entity.event.Event;
import com.example.eventtest.domain.entity.event.EventInfo;

public class EntityMapper {

    public static RoomEvent toRoomEvent(Event event) {
        return new RoomEvent(
                event.getId() + "",
                event.getEventInfo().getEventTitle() + "",
                event.getEventInfo().getEventDate() + "",
                event.getEventInfo().getPlace() + "",
                event.getEventInfo().getDescription() + "",
                event.getEventInfo().getLocation() + "",
                event.getEventInfo().getCategories() + "",
                event.getEventInfo().getAgeRestriction() + "",
                event.getEventInfo().getPrice() + "",
                event.getEventInfo().getIsFree() + "",
                event.getEventInfo().getImages() + "",
                event.getEventInfo().getParticipants() + ""
        );
    }

    public static Event toEvent(RoomEvent roomEvent) {
        Event event = new Event(
                roomEvent.getEventId() + "",
                new EventInfo(
                        roomEvent.getEventTitle() + "",
                        roomEvent.getDate() + "",
                        roomEvent.getPlace() + "",
                        roomEvent.getDescription() + "",
                        roomEvent.getLocation() + "",
                        roomEvent.getCategories() + "",
                        roomEvent.getAgeRestriction() + "",
                        roomEvent.getPrice() + "",
                        roomEvent.getIsFree() + "",
                        roomEvent.getImages() + "",
                        roomEvent.getParticipants() + ""
                ));
        return event;
    }
}
