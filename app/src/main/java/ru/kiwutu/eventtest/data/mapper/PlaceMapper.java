package ru.kiwutu.eventtest.data.mapper;

import ru.kiwutu.eventtest.data.db_room.entity.RoomPlace;
import ru.kiwutu.eventtest.domain.entity.place.Place;
import ru.kiwutu.eventtest.domain.entity.place.PlaceInfo;

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
