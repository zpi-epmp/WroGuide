package com.wroguide.presenter;

import android.support.v7.widget.RecyclerView;

import com.wroguide.model.Route;
import com.wroguide.model.RouteFakeDAO;
import com.wroguide.model.Routes;

import java.util.ArrayList;
import java.util.List;

public class ListRoutePresenter extends ListPresenter {

    private Routes routes;

    /*public ListPlacePresenter(Places places) {
        this.places = places;
    }*/

    public ListRoutePresenter(RecyclerView recyclerView) {
        routes = new Routes(new RouteFakeDAO());
        createAndSetAdapter(routes.getRoutes(), recyclerView);
    }

    public List<Route> getAllRoutes() {
        return routes.getRoutes();
    }

    public List<Route> getPlacesByLocation() {
        List<Route> filteredPlaces;
        //TODO Filtrowanie
        filteredPlaces = new ArrayList<>(routes.getRoutes());
        return filteredPlaces;
    }

}
