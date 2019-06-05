package com.wroguide.model;

import android.support.constraint.ConstraintLayout;

/**
 * Created by Piotrek on 17.03.2019.
 */
public class Construction extends Place {

    public Construction(){

    }

    public Construction(String image, String content, String title, String description) {
        super(image, content, title, description);
    }

    public Construction(String image, String content, String title, String description, double latitude, double longitude) {
        super(image, content, title, description, latitude, longitude);
    }

    public Construction(String image, String content, String title, String description, double latitude, double longitude, String url){
        super(image, content, title, description, latitude, longitude, url);
    }

}
