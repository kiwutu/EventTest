
package ru.kiwutu.eventtest.data.API.entity;

import ru.kiwutu.eventtest.data.API.entity.descriptionFields.Location;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class EventData {

    @SerializedName("dates")
    @Expose
    private List<Date> dates;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("place")
    @Expose
    private String place;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("categories")
    @Expose
    private List<String> categories;
    @SerializedName("age_restriction")
    @Expose
    private String ageRestriction;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("is_free")
    @Expose
    private boolean isFree;
    @SerializedName("images")
    @Expose
    private String images;
    @SerializedName("participants")
    @Expose
    private List<Object> participants;

    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place.toString();
    }

    public void setPlace(String place) {
        this.place = place;
    }

    //TODO del <p>, </p> ("<p>Гости вживую ... яркие хиты.</p>")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(String ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIsFree() {
        if (isFree)return "Бесплатно";
        return "";
    }

    public void setIsFree(boolean isFree) {
        this.isFree = isFree;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public List<Object> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Object> participants) {
        this.participants = participants;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EventData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dates");
        sb.append('=');
        sb.append(((this.dates == null)?"<null>":this.dates));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("place");
        sb.append('=');
        sb.append(((this.place == null)?"<null>":this.place));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("categories");
        sb.append('=');
        sb.append(((this.categories == null)?"<null>":this.categories));
        sb.append(',');
        sb.append("ageRestriction");
        sb.append('=');
        sb.append(this.ageRestriction);
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("isFree");
        sb.append('=');
        sb.append(this.isFree);
        sb.append(',');
        sb.append("images");
        sb.append('=');
        sb.append(((this.images == null)?"<null>":this.images));
        sb.append(',');
        sb.append("participants");
        sb.append('=');
        sb.append(((this.participants == null)?"<null>":this.participants));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
