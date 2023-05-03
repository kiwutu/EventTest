package ru.kiwutu.eventtest.data.db_room.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import ru.kiwutu.eventtest.data.db_room.entity.RoomPlace;

@Database(entities = {RoomPlace.class}, version = 1)
public abstract class AppDataBasePlace extends RoomDatabase {

    private static AppDataBasePlace instance;
    public abstract RoomPlace roomPlace();

    public static AppDataBasePlace getInstance(Context context) {
        AppDataBasePlace tempInstance = instance;
        if (tempInstance != null)
            return tempInstance;
        else tempInstance = Room.databaseBuilder(
                        context,
                        AppDataBasePlace.class,
                        AppDataBasePlace.class.getSimpleName()
                )
                .build();
        instance = tempInstance;
        return tempInstance;
    }

}
