package com.example.dine;

import android.graphics.drawable.Drawable;

public class DataPlace {
    String placeName;
    String location;
    int img;

    public DataPlace() {
    }

    public DataPlace(String placeName, String location, int img) {
        this.placeName = placeName;
        this.location = location;
        this.img = img;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
