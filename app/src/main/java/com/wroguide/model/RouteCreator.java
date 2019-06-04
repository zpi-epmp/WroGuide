package com.wroguide.model;

import android.location.Location;

/**
 * Created by Piotrek on 01.06.2019.
 */
public class RouteCreator {
    private Places placesToVisit;
    private Places placesNotVisited;
//    private Map<Integer, Place> nodes;
//    private float distances[][];

    public RouteCreator(Places placesToVisit) {
        this.placesToVisit = placesToVisit;
        setPlacesNotVisited();
//        nodes = new HashMap<>();
//        setNodeId();
//        int n = placesToVisit.getPlaces().size();
//        distances = new float[n][n];
//        countDistances();
    }

//    private void setNodeId() {
//        int i = 0;
//        for (Place p : places.getPlaces()) {
//            nodes.put(i, p);
//            i++;
//        }
//    }

//    private void countDistances() {
//        for (Map.Entry<Integer, Place> entry : nodes.entrySet()) {
//            int id = entry.getKey();
////            1Place place = entry.getValue();
//            for (int i = 0; i < distances[id].length; i++) {
//                Place pA = Objects.requireNonNull(nodes.get(id));
//                Place pB = Objects.requireNonNull(nodes.get(i));
//                distances[id][i] = distance(pA, pB);
//            }
//        }
//    }

    private void setPlacesNotVisited() {
        placesNotVisited = new Places();
        for (Place p : placesToVisit.getPlaces()) {
             placesNotVisited.getPlaces().add(p);
        }
    }

    private float distance(Place pA, Place pB) {
        Location locationA = new Location(pA.getTitle());
        locationA.setLatitude(pA.getLatitude());
        locationA.setLongitude(pA.getLongitude());

        Location locationB = new Location(pB.getTitle());
        locationB.setLatitude(pB.getLatitude());
        locationB.setLongitude(pB.getLongitude());

        return locationA.distanceTo(locationB);
    }

    public Places shortestPath() {
        Places newPlaces = new Places();
        Place currentPlace = nearestPlace(placesNotVisited.getPlaces().get(0));
        Place nearestPlace;
        for (int i = 1; i < placesToVisit.getPlaces().size(); i++) {
            System.out.println("currentPlace: " + currentPlace.getTitle());
            nearestPlace = nearestPlace(currentPlace);
            newPlaces.getPlaces().add(nearestPlace);
            System.out.println("nearestPlace: " + nearestPlace);
            currentPlace = newPlaces.getPlaces().get(i-1);
            System.out.println("nearestPlace(?): " + currentPlace.getTitle());
        }

        return newPlaces;
    }

    private Place nearestPlace(Place place) {
        int returnedPlacePos = 0;
        Place returnedPlace = placesNotVisited.getPlaces().get(returnedPlacePos);
        float shortestDistance = distance(place, returnedPlace);
        for (int i = 1; i < placesNotVisited.getPlaces().size(); i++) {
            Place p = placesNotVisited.getPlaces().get(i);
            if (distance(p, place) < shortestDistance) {
                shortestDistance = distance(p, place);
                returnedPlace = p;
                returnedPlacePos = i;
            }
        }
        placesNotVisited.getPlaces().remove(returnedPlacePos);

        return returnedPlace;
    }
}
