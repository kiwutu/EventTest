package ru.kiwutu.eventtest.data.db_room.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import ru.kiwutu.eventtest.data.db_room.dao.PlaceDAO;
import ru.kiwutu.eventtest.data.db_room.entity.RoomPlace;

@Database(entities = {RoomPlace.class}, version = 1)
public abstract class DataBasePlace extends RoomDatabase {

    private static DataBasePlace instance;

    public abstract PlaceDAO placeDAO();

    public static DataBasePlace getInstance(Context context) {
        DataBasePlace tempInstance = instance;
        if (tempInstance != null)
            return tempInstance;
        else tempInstance = Room.databaseBuilder(
                        context,
                        DataBasePlace.class,
                        DataBasePlace.class.getSimpleName()
                )
                .build();
        instance = tempInstance;
        return tempInstance;
    }

}
