package com.example.eventtest.data.mapper;

import com.example.eventtest.data.db_room.entity.RoomPlace;
import com.example.eventtest.domain.entity.place.Place;
import com.example.eventtest.domain.entity.place.PlaceInfo;

public class PlaceMapper {

    public static RoomPlace toRoomPlace(Place place) {
        return new RoomPlace(place.getId(), place.toString());
    }

    public static Place toPlace(RoomPlace roomPlace) {
        Place place = new Place(
                roomPlace.getEventId() + "",
                new PlaceInfo(roomPlace.getPlace()));
        return place;
    }

}
