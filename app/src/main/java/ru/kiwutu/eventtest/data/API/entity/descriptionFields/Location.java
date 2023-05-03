
package ru.kiwutu.eventtest.data.API.entity.descriptionFields;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Location {

    @SerializedName("slug")
    @Expose
    private String slug;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Override
    public String toString() {

        if (Objects.equals(slug, "ekb")) return  "г.Екатеринбург, ";
        if (Objects.equals(slug, "online"))return  "Онлайн ";
        return  "Место не определено";
    }

}
