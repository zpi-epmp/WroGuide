package com.wroguide.model;

import java.io.Serializable;

/**
 * Created by Piotrek on 17.03.2019.
 */
public abstract class Place implements ListElement, Serializable {

    protected String image;
    protected String content;
    protected String title;
    protected String description;
    protected double latitude;
    protected double longitude;
    public boolean selected;

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

