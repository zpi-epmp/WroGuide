package com.example.zpi_lista;

import android.net.Uri;

public class Bridge implements ListElement {

    private Uri image;
    private String description;

    public Bridge(Uri image, String description) {
        this.image = image;
        this.description = description;
    }

    public Uri getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

}
