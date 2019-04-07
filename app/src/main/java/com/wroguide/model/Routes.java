package com.wroguide.model;

import java.util.List;

/**
 * Created by Piotrek on 17.03.2019.
 */
public class Routes {
    private List<Route> routes;

    public  Routes(RouteDAO dao) {
        routes = dao.getAll();
    }

    public List<Route> getPlaces() {
        return routes;
    }

    public void setPlaces(List<Route> routes) {
        this.routes = routes;
    }
}
