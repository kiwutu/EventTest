
package ru.kiwutu.eventtest.data.API.entity.descriptionFields;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.net.URL;

public class Image {

    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("source")
    @Expose
    private Source source;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    @Override
    public String toString() {
        try {
            URL url = new URL(image);
            Bitmap imageBit = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            return String.valueOf(imageBit);
        } catch (IOException e) {
            return "Image not loaded...";
        }

    }

}
