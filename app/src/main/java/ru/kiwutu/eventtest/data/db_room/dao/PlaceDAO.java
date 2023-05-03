package ru.kiwutu.eventtest.data.db_room.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import ru.kiwutu.eventtest.data.db_room.entity.RoomPlace;

import java.util.List;

@Dao
public interface PlaceDAO {

    // SELECT ALL
    @Query("SELECT * FROM Place ORDER BY Place_id ASC")
    List<RoomPlace> roomPlaceGetAll();

    // INSERT NEW RECORD
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void roomPlaceAddNew(RoomPlace place);

    // DELETE RECORD BY ID
    @Query("DELETE FROM Place WHERE Place_id = :id")
    void roomPlaceDeleteById(String id);

    // SELECT ONE BY ID
    @Query("SELECT * FROM Place WHERE Place_id = :id")
    RoomPlace roomPlaceGetById(String id);

}
