package com.wroguide.presenter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wroguide.model.Place;
import com.wroguide.model.PlaceFakeDAO;
import com.wroguide.model.Places;
import com.wroguide.model.RouteFakeDAO;
import com.wroguide.model.Routes;
import com.wroguide.view.PlaceActivity;

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
        //Na razie wczytujemy tylko obiekty z pierwszej trasy
        places = new Routes(new RouteFakeDAO()).getRoutes().get(0).getPlaces();
//        places = new Places(new PlaceFakeDAO());
        createAndSetAdapter(places.getPlaces(), recyclerView);
    }

    public void onClick(View v) {
        if(!adapter.getElements().isEmpty()) {
            Context context = v.getContext();
            int position = adapter.getRecyclerView().getChildLayoutPosition(v);
            Intent intent = new Intent(context, PlaceActivity.class);
            Place place = (Place) adapter.getElements().get(position);
            intent.putExtra("place", place);
            context.startActivity(intent);
        }
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
