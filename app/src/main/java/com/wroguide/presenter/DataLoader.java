package com.wroguide.presenter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;

import com.google.firebase.database.FirebaseDatabase;
import com.wroguide.model.Place;
import com.wroguide.model.PlaceDAO;
import com.wroguide.model.PlaceDatabaseDAO;
import com.wroguide.model.Places;
import com.wroguide.model.Route;
import com.wroguide.model.RouteDAO;
import com.wroguide.model.RouteDatabaseDAO;
import com.wroguide.model.Routes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.List;

public class DataLoader {

    public DataLoader(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        database.setPersistenceEnabled(true);
    }

    public Places loadPlaces(){
        PlaceDAO dao = new PlaceDatabaseDAO();
        List<Place> list = dao.getAll();
        Places places = new Places();
        places.setPlaces(list);
        return places;
    }

    public Routes loadRoutes(){
        RouteDAO dao = new RouteDatabaseDAO();
        List<Route> list = dao.getAll();
        Routes routes = new Routes();
        routes.setRoutes(list);
        return routes;
    }

}
