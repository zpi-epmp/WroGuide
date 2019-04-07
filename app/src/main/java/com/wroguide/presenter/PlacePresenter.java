package com.wroguide.presenter;

import com.wroguide.model.Place;

/**
 * Created by Piotrek on 08.04.2019.
 */
public class PlacePresenter {
    private Place place;

    public PlacePresenter(Place place) {
        this.place = place;
    }

    public Place getPlace() {
        return place;
    }
}
