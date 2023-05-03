package com.example.eventtest.data.db_room.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.eventtest.data.db_room.entity.RoomEvent;

@Database(entities = {RoomEvent.class}, version = 1)
public abstract class AppDataBaseEvent extends RoomDatabase {
    private static AppDataBaseEvent instance;

    public abstract RoomEvent roomEvent();

    public static AppDataBaseEvent getInstance(Context context) {
        AppDataBaseEvent tempInstance = instance;
        if (tempInstance != null)
            return tempInstance;
        else tempInstance = Room.databaseBuilder(
                        context,
                        AppDataBaseEvent.class,
                        AppDataBaseEvent.class.getSimpleName()
                )
                .build();
        instance = tempInstance;
        return tempInstance;
    }

}
