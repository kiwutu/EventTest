package ru.kiwutu.eventtest.data.db_room.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import ru.kiwutu.eventtest.data.db_room.dao.EventDAO;
import ru.kiwutu.eventtest.data.db_room.entity.RoomEvent;

@Database(entities = {RoomEvent.class}, version = 1)
public abstract class DataBaseEvent extends RoomDatabase {
    private static DataBaseEvent instance;

    public abstract EventDAO eventDAO();

    public static DataBaseEvent getInstance(Context context) {
        DataBaseEvent tempInstance = instance;
        if (tempInstance != null)
            return tempInstance;
        else tempInstance = Room.databaseBuilder(
                        context,
                        DataBaseEvent.class,
                        DataBaseEvent.class.getSimpleName()
                )
                .build();
        instance = tempInstance;
        return tempInstance;
    }

}
