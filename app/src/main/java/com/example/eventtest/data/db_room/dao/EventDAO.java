package com.example.eventtest.data.db_room.dao;

import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;


import com.example.eventtest.data.db_room.entity.RoomEvent;

import java.util.List;

public interface EventDAO {

    // SELECT ALL
    @Query("SELECT * FROM Events ORDER BY Event_id ASC")
    List<RoomEvent> roomEventGetAll();

    // INSERT NEW RECORD
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void roomEventAddNew(RoomEvent roomEvent);

    // DELETE RECORD BY ID
    @Query("DELETE FROM Events WHERE Event_id = :id")
    void roomEventDeleteById(String id);




    // SELECT ONE BY ID
    @Query("SELECT * FROM Events WHERE Event_id = :id")
    RoomEvent roomEventGetById(String id);


    // SELECT ONE BY CATEGORIES
    @Query("SELECT * FROM Events WHERE Categories = :categories")
    RoomEvent roomEventGetByCategories(String categories);
}
