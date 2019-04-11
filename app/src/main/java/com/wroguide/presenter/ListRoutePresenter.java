package com.wroguide.presenter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wroguide.model.Route;
import com.wroguide.model.RouteFakeDAO;
import com.wroguide.model.Routes;
import com.wroguide.view.RouteActivity;

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

    public void onClick(View v) {
        if(!adapter.getElements().isEmpty()) {
            Context context = v.getContext();
            int position = adapter.getRecyclerView().getChildLayoutPosition(v);
            Intent intent = new Intent(context, RouteActivity.class);
            Route route = (Route) adapter.getElements().get(position);
            intent.putExtra("route", route);
            context.startActivity(intent);
        }
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
