package com.wroguide.model;

/**
 * Created by Piotrek on 17.03.2019.
 */
public class Building extends Place {

    public Building(){

    }

    public Building(String image, String content, String title, String description) {
        super(image, content, title, description);
    }

    public Building(String image, String content, String title, String description, double latitude, double longitude) {
        super(image, content, title, description, latitude, longitude);
    }

    public Building(String image, String content, String title, String description, double latitude, double longitude, String url){
        super(image, content, title, description, latitude, longitude, url);
    }
}
