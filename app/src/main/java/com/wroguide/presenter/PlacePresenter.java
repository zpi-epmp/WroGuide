package com.wroguide.presenter;

import com.wroguide.model.Place;

public class PlacePresenter {
    private Place place;

    public PlacePresenter(Place place) {
        this.place = place;
    }

    public Place getPlace() {
        return place;
    }
}
