package com.example.eventtest.domain.entity.place;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.eventtest.domain.entity.place.comparators.ComparatorByID;

import java.util.Comparator;


public class Place {
    public static final Comparator<Place> byID;

    static {
        byID = new ComparatorByID();
    }

    private final PlaceInfo placeInfo;
    private String id;

    public String getId() {
        return id;
    }

    // Constructor for exist "room's database entity"
    public Place(String id, PlaceInfo placeInfo) {
        this.placeInfo = placeInfo;
        this.id = id;
    }

    // Constructor by default for new objects
    public Place(PlaceInfo placeInfo) {
        this.placeInfo = placeInfo;
    }


    @NonNull
    @Override
    public String toString() {
        return placeInfo.toString();
    }

    public PlaceInfo getEventInfo() {
        return placeInfo;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Place guest = (Place) obj;
        return id.equals(guest.getId())
                && (placeInfo == guest.getEventInfo()
                || (placeInfo != null && placeInfo.equals(guest.getEventInfo()))
        );
    }
}
