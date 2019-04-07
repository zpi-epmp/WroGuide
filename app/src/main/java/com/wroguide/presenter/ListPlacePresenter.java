package com.wroguide.presenter;

import com.wroguide.model.Place;
import com.wroguide.model.Places;

import java.util.ArrayList;
import java.util.List;

public class ListPlacePresenter {
    private Places places;

    public ListPlacePresenter(Places places) {
        this.places = places;
    }

    public List<Place> getAllPlaces() {
        return places.getPlaces();
    }

    public List<Place> getPlacesByLocation() {
        List<Place> filteredPlaces;
        //TODO Filtrowanie
        filteredPlaces = new ArrayList<>(places.getPlaces());
        return filteredPlaces;
    }
}
