package com.wroguide.presenter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.wroguide.model.Bridge;
import com.wroguide.model.Building;
import com.wroguide.model.Construction;
import com.wroguide.model.Place;
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

    public ListPlacePresenter(RecyclerView recyclerView, Places places, String rodzajListy) {
        this.places = places;
        createAndSetAdapter(places.getPlaces(), recyclerView, rodzajListy);
    }

    public ListPlacePresenter(RecyclerView recyclerView) {
        //Na razie wczytujemy tylko obiekty z pierwszej trasy
        places = new Routes(new RouteFakeDAO()).getRoutes().get(0).getPlaces();
//        places = new Places(new PlaceFakeDAO());
        createAndSetAdapter(places.getPlaces(), recyclerView,"obiekty");
    }


    public ListPlacePresenter(RecyclerView recyclerView, Places places, int choice, String objectName) {

        this.places = places;
        places.setPlaces(getPlacesByFilterOption(choice, objectName));
        createAndSetAdapter(places.getPlaces(), recyclerView, "obiekty");

    }




    public void onClick(View v) {
        if (!adapter.getElements().isEmpty()) {
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

        filteredPlaces = new ArrayList<>(places.getPlaces());
        return filteredPlaces;
    }

    public List<Place> getPlacesByFilterOption(int choice, String objectName) {

        List<Place> filteredPlaces = new ArrayList<>();
        List<Place> placesToFilter = new ArrayList<>(places.getPlaces());


        switch (choice) {
            case 0:
                for (Place p : placesToFilter) {
                    if (p.getClass() == Bridge.class)
                        filteredPlaces.add(p);
                }
                break;
            case 1:
                for (Place p : placesToFilter) {
                    if (p.getClass() == Building.class)
                        filteredPlaces.add(p);
                }
                break;
            case 2:
                for (Place p : placesToFilter) {
                    if (p.getClass() == Construction.class)
                        filteredPlaces.add(p);
                }
                break;

            case 3:
                for (Place p : placesToFilter) {
                    if (p.getTitle().equals(objectName))
                        filteredPlaces.add(p);
                }


                break;
        }
        return filteredPlaces;
    }
}
