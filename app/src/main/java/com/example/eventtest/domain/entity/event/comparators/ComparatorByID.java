package com.example.eventtest.domain.entity.event.comparators;

import com.example.eventtest.domain.entity.event.Event;

import java.util.Comparator;


public class ComparatorByID implements Comparator<Event> {

    @Override
    public int compare(Event event1, Event event2) {
        String id1 = event1.getId();
        String id2 = event2.getId();
        return id1.compareTo(id2);
    }
}