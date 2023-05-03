package com.example.eventtest.domain.entity.place.comparators;


import com.example.eventtest.domain.entity.place.Place;

import java.util.Comparator;


public class ComparatorByID implements Comparator<Place> {

    @Override
    public int compare(Place place1, Place place2) {
        String id1 = place1.getId();
        String id2 = place2.getId();
        return id1.compareTo(id2);
    }
}