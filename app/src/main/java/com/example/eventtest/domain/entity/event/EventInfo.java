package com.example.eventtest.domain.entity.event;


public class EventInfo {
    private final String eventTitle;
    private final String eventDate;
    private final String place;
    private final String description;
    private final String location;
    private final String categories;
    private final String ageRestriction;
    private final String price;
    private final String isFree;
    private final String images;
    private final String participants;


    public EventInfo(String eventTitle, String eventDate,
                     String place, String description,
                     String location, String categories,
                     String ageRestriction, String price,
                     String isFree, String images,
                     String participants
    ) {
        this.eventTitle = eventTitle;
        this.eventDate = eventDate;
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

    private String createSHA256String() {
        return eventTitle + place + description +
                categories + price;
    }

    public String getToSHA256() {
        return createSHA256String();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != getClass()) return false;
        EventInfo info= (EventInfo) object;
        return
                this.eventTitle.equals(info.getEventTitle())&&
                this.eventDate.equals(info.getEventDate())&&
                this.place.equals(info.getPlace())&&
                this.description.equals(info.getDescription())&&
                this.location.equals(info.getLocation())&&
                this.categories.equals(info.getCategories())&&
                this.ageRestriction.equals(info.getAgeRestriction())&&
                this.price.equals(info.getPrice())&&
                this.isFree.equals(info.getIsFree())&&
                this.images.equals(info.getImages())&&
                this.participants.equals(info.getParticipants());
    }

    //TODO
   /* @NonNull
    @Override
    public String toString() {
        return  + ", " +  + " " + ;
    }*/

    public String getEventTitle() {
        return eventTitle;
    }

    public String getEventDate() {
        return eventDate;
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








