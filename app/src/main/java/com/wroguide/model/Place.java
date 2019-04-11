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

    protected Place(String image, String content, String title, String description) {
        this.image = image;
        this.content = content;
        this.title = title;
        this.description = description;
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
}
