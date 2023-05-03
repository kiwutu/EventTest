package com.example.eventtest.domain.entity.event;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.example.eventtest.domain.entity.event.comparators.ComparatorByID;

import java.util.Comparator;


public class Event {
    public static final Comparator<Event> byID;

    static {
        byID = new ComparatorByID();
    }

    private final EventInfo eventInfo;
    private
//    final
    String id;

    public String getId() {
        return id;
    }

    // Constructor for exist "room's database entity"
    public Event(String id, EventInfo eventInfo) {
        this.eventInfo = eventInfo;
        this.id = id;
    }

    // Constructor by default for new objects
    public Event(EventInfo eventInfo) {
        this.eventInfo = eventInfo;
//        this.id = createId(eventInfo);
    }


    @NonNull
    @Override
    public String toString() {
        return eventInfo.toString();
    }

    public EventInfo getEventInfo() {
        return eventInfo;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Event guest = (Event) obj;
        return id.equals(guest.getId())
                && (eventInfo == guest.getEventInfo()
                || (eventInfo != null && eventInfo.equals(guest.getEventInfo()))
        );
    }
}
