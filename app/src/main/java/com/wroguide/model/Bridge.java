package com.wroguide.model;

/**
 * Created by Piotrek on 17.03.2019.
 */

public class Bridge extends Place {

    public Bridge(){

    }

    public Bridge(String image, String content, String title, String description) {
        super(image, content, title, description);
    }

    public Bridge(String image, String content, String title, String description, double latitude, double longitude) {
        super(image, content, title, description, latitude, longitude);
    }
}
