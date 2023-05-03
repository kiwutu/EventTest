package com.example.eventtest.data.db_room.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
        tableName = RoomPlace.NAME_TABLE,
        indices = {@Index(RoomPlace.COL_PLACE_ID)}
)
public class RoomPlace {

    public static final String NAME_TABLE = "Place";
    public static final String COL_PLACE_ID = "Place_id";
    public static final String COL_PLACE = "Place_address";
    @PrimaryKey
//    @ForeignKey(childColumns = RoomEvent.COL_PLACE)
    @NonNull
    @ColumnInfo(name = COL_PLACE_ID)
    private final String eventId;

    @ColumnInfo(name = COL_PLACE)
    private final String place;


    public RoomPlace(@NonNull String eventId, String place) {
        this.eventId = eventId;
        this.place = place;
    }


    @NonNull
    public String getEventId() {
        return eventId;
    }

    public String getPlace() {
        return place;
    }

}
