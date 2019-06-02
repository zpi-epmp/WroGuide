package com.wroguide.presenter;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Piotrek on 01.06.2019.
 */
public class RouteDrawer {

    public RouteDrawer() {

    }

    public String getUrl(LatLng origin, LatLng destination, String directionMode, String googleMapsKey) {
        String str_origin = "origin=" + origin.latitude + "," + origin.longitude;
        String str_dest = "destination=" + destination.latitude + "," + destination.longitude;
        String mode = "mode=" + directionMode;
        String parameters = str_origin + "&" + str_dest + "&" + mode;
        String output = "json";

        String url = "https://maps.googleapis.com/maps/api/directions/" + output + "?" + parameters + "&key=" + googleMapsKey;
        return url;
    }
}
