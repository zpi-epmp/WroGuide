package com.wroguide.presenter;

import android.text.method.Touch;

import com.wroguide.R;
import com.wroguide.model.Place;
import com.wroguide.model.Places;
import com.wroguide.model.Route;
import com.wroguide.model.RouteDatabaseDAO;
import com.wroguide.model.RouteFakeDAO;
import com.wroguide.model.Routes;

import java.util.ArrayList;
import java.util.List;

public class ModelUpdater {

    public static List<Route> routesList;

    public Routes addNewRoute(Places places, String title){
List<Place> newRoadPlacesList=new ArrayList<>();

        for(Place p:places.getPlaces()){
            if(p.isSelected())
                newRoadPlacesList.add(p);
        }

        Places newRoadPlaces =new Places(newRoadPlacesList);
        //Route newRoute  = new Route(Integer.toString(R.drawable.kamienica), "Trasa użytkownika", title);
        Route newRoute = new Route("kamienica.JPG", "Trasa użytkownika", title,
                "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/kamienica.JPG?alt=media&token=f2f88a97-e956-4070-b84e-c9074d5d2741");
        newRoute.setPlaces(newRoadPlaces);

        //RouteFakeDAO fakeRoutes=new RouteFakeDAO();
        //RouteDatabaseDAO fakeRoutes = new RouteDatabaseDAO();
        //List<Route> routesList=fakeRoutes.getAll();
        routesList.add(newRoute);
        Routes routes =new Routes();
        routes.setRoutes(routesList);
        return routes;
    }


}
