package com.wroguide.presenter;

import com.wroguide.R;
import com.wroguide.model.Place;
import com.wroguide.model.Places;
import com.wroguide.model.Route;
import com.wroguide.model.RouteFakeDAO;
import com.wroguide.model.Routes;

import java.util.ArrayList;
import java.util.List;

public class ModelUpdater {


    public Routes addNewRoute(Places places, String title){
List<Place> newRoadPlacesList=new ArrayList<>();

        for(Place p:places.getPlaces()){
            if(p.isSelected())
                newRoadPlacesList.add(p);
        }

        Places newRoadPlaces =new Places(newRoadPlacesList);
        Route newRoute  = new Route(Integer.toString(R.drawable.kamienica),
                "Trasa użytkownika", title);
        newRoute.setPlaces(newRoadPlaces);

        RouteFakeDAO fakeRoutes=new RouteFakeDAO();
        List<Route> routesList=fakeRoutes.getAll();
        routesList.add(newRoute);
        Routes routes =new Routes();
        routes.setRoutes(routesList);
        return routes;
    }


}
