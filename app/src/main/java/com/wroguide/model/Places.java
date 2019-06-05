package com.wroguide.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Piotrek on 17.03.2019.
 */
public class Places implements Serializable {
    private List<Place> places;

    public Places() {
        places = new ArrayList<>();
    }
    public Places(List list) {
        places = list;
    }

    public Places(PlaceDAO dao) {
        places = dao.getAll();
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }
}
