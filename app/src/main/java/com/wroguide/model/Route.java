package com.wroguide.model;

import java.io.Serializable;

/**
 * Created by Piotrek on 17.03.2019.
 */
public class Route implements ListElement, Serializable {

    //private String url;
    private String image;
    private String content;
    private String title;
    private Places places;

    public Route(String image, String description, String title) {
        this.image = image;
        this.content = description;
        this.title = title;
    }

    public void setPlaces(Places places) {
        this.places = places;
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

    public Places getPlaces() {
        return places;
    }

    public boolean isSelected() {
        return false;
    }

    public void setSelected(boolean s) {

    }

    public String getUrl(){
        return null;
    }
}
