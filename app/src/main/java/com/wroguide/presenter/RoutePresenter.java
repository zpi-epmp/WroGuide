package com.wroguide.presenter;

import com.wroguide.model.Route;

public class RoutePresenter extends BasePresenter {

    private Route route;

    public RoutePresenter(Route route) {
        this.route = route;
    }

    public Route getRoute() {
        return route;
    }

}
