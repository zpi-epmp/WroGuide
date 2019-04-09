package com.wroguide.presenter;

import android.support.v7.widget.RecyclerView;

import com.wroguide.model.Place;
import com.wroguide.model.PlaceFakeDAO;
import com.wroguide.model.Places;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Piotrek on 08.04.2019.
 */
public class ListPlacePresenter extends ListPresenter {
    private Places places;

    public ListPlacePresenter(RecyclerView recyclerView, Places places) {
        this.places = places;
        createAndSetAdapter(places.getPlaces(), recyclerView);
    }

    public ListPlacePresenter(RecyclerView recyclerView) {
        places = new Places(new PlaceFakeDAO());
        createAndSetAdapter(places.getPlaces(), recyclerView);
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
