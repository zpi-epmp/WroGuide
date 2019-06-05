package com.wroguide.model;

import java.io.Serializable;

/**
 * Created by Piotrek on 17.03.2019.
 */

public class Place implements ListElement, Serializable {

    public String image;
    public String url;
    public String content;
    public String title;
    public String description;
    public double latitude;
    public double longitude;
    public boolean selected;

    public Place(){

    }

    protected Place(String image, String content, String title, String description) {
        this.image = image;
        this.content = content;
        this.title = title;
        this.description = description;

    }

    protected Place(String image, String content, String title, String description, double latitude, double longitude) {
        this(image, content, title, description);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    protected Place(String image, String content, String title, String description, double latitude, double longitude, String url){
        this(image, content, title, description, latitude, longitude);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getImage() {
        return image;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;}

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected=selected;
        }



    }

