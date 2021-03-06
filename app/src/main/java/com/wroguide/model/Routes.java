package com.wroguide.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Piotrek on 17.03.2019.
 */
public class Routes implements Serializable {
    private List<Route> routes;

    public Routes(List<Route> routes){
        this.routes = routes;
    }

    public Routes(RouteDAO dao) {
        routes = dao.getAll();
    }
    public Routes() {
        routes = new ArrayList<>();
    }
    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }
}
