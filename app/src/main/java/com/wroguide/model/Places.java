package com.wroguide.model;

import java.util.List;

/**
 * Created by Piotrek on 17.03.2019.
 */
public class Places {
    private List<Place> places;

    public  Places(PlaceDAO dao) {
        places = dao.getAll();
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }
}
