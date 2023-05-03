package ru.kiwutu.eventtest.data.db_room.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
        tableName = RoomEvent.NAME_TABLE,
        indices = {@Index(RoomEvent.COL_EVENT_ID)}
)
public class RoomEvent {

    public static final String NAME_TABLE = "Events";
    public static final String COL_EVENT_ID = "Event_id";
    public static final String COL_EVENT_TITLE = "Event_title";
    public static final String COL_DATE = "Event_date";
    public static final String COL_PLACE = "Place";
    public static final String COL_DESCRIPTION = "Description";
    public static final String COL_LOCATION = "Location";
    public static final String COL_CATEGORIES = "Categories";
    public static final String COL_AGE_RESTRICTION = "Age_restriction";
    public static final String COL_PRICE = "Price";
    public static final String COL_IS_FREE = "Is_free";
    public static final String COL_IMAGES = "Images";
    public static final String COL_PARTICIPANTS = "Participants";


    @PrimaryKey
    @NonNull
    @ColumnInfo(name = COL_EVENT_ID)
    private final String eventId;

    @NonNull
    @ColumnInfo(name = COL_EVENT_TITLE)
    private final String eventTitle;

    @ColumnInfo(name = COL_DATE)
    private final String date;

//    @PrimaryKey
    @ColumnInfo(name = COL_PLACE)
    private final String place;

    @ColumnInfo(name = COL_DESCRIPTION)
    private final String description;

    @ColumnInfo(name = COL_LOCATION)
    private final String location;

    @ColumnInfo(name = COL_CATEGORIES)
    private final String categories;

    @ColumnInfo(name = COL_AGE_RESTRICTION)
    private final String ageRestriction;

    @ColumnInfo(name = COL_PRICE)
    private final String price;

    @ColumnInfo(name = COL_IS_FREE)
    private final String isFree;

    @ColumnInfo(name = COL_IMAGES)
    private final String images;

    @ColumnInfo(name = COL_PARTICIPANTS)
    private final String participants;


    public RoomEvent(
            @NonNull String eventId,
            String eventTitle,
            String date,
            String place,
            String description,
            String location, String categories,
            String ageRestriction, String price,
            String isFree, String images,
            String participants) {
        this.eventId = eventId;
        this.eventTitle = eventTitle;
        this.date = date;
        this.place = place;
        this.description = description;
        this.location = location;
        this.categories = categories;
        this.ageRestriction = ageRestriction;
        this.price = price;
        this.isFree = isFree;
        this.images = images;
        this.participants = participants;
    }

    @NonNull
    public String getEventId() {
        return eventId;
    }

    @NonNull
    public String getEventTitle() {
        return eventTitle;
    }

    public String getDate() {
        return date;
    }

    public String getPlace() {
        return place;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getCategories() {
        return categories;
    }

    public String getAgeRestriction() {
        return ageRestriction;
    }

    public String getPrice() {
        return price;
    }

    public String getIsFree() {
        return isFree;
    }

    public String getImages() {
        return images;
    }

    public String getParticipants() {
        return participants;
    }
}
