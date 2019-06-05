package com.wroguide.view;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.wroguide.R;
import com.wroguide.model.FetchURL;
import com.wroguide.model.Place;
import com.wroguide.model.Places;
import com.wroguide.model.Route;
import com.wroguide.model.RouteCreator;
import com.wroguide.model.RouteFakeDAO;
import com.wroguide.model.Routes;
import com.wroguide.model.TaskLoadedCallback;
import com.wroguide.presenter.RouteDrawer;

import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, TaskLoadedCallback {

    private GoogleMap mMap;
    private Polyline currentPolyline;
    private Routes routes;
    private LatLngBounds.Builder latLngBoundsBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        latLngBoundsBuilder = new LatLngBounds.Builder();

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, 1);
            return;
        }
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
                || ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        }

        routes = new Routes(new RouteFakeDAO());
        putMarkers(routes);
//        for (Route r : routes.getRoutes()) {
//            List<Place> places = r.getPlaces().getPlaces();
//            putMarkers(places);
//        }
        mMap.animateCamera(CameraUpdateFactory.newLatLngBounds(latLngBoundsBuilder.build(),100));

        //rysowanie trasy -
        //przykład dla pierwszej trasy ze wszystkich w RouteFakeDAO:
        RouteCreator routeCreator = new RouteCreator(routes.getRoutes().get(0).getPlaces());
        Places newPlaces = routeCreator.shortestPath(); //wyznaczenie najkrótszej trasy dla pierwszej trasy

        drawRoute(newPlaces.getPlaces());
    }

    public void putMarkers(Routes routes) {
        for (Route r : routes.getRoutes()) {
            List<Place> places = r.getPlaces().getPlaces();
            putMarkers(places);
        }
    }

    public void putMarkers(List<Place> places) {
        for (int i = 0; i < places.size() - 1; i++) {
            Place pA = places.get(i);
            Place pB = places.get(i + 1);
            MarkerOptions markerA = new MarkerOptions().position(new LatLng(pA.getLatitude(), pA.getLongitude())).title(pA.getTitle());
            MarkerOptions markerB = new MarkerOptions().position(new LatLng(pB.getLatitude(), pB.getLongitude())).title(pB.getTitle());
            mMap.addMarker(markerA);

            latLngBoundsBuilder.include(new LatLng(pA.getLatitude(), pA.getLongitude()));
            if (i == places.size() - 2) {
                mMap.addMarker(markerB);
                latLngBoundsBuilder.include(new LatLng(pB.getLatitude(), pB.getLongitude()));
            }
        }
    }

    public void drawRoute(Route route) {
        drawRoute(route.getPlaces().getPlaces());
    }

    public void drawRoute(List<Place> places) {
        for (int i = 0; i < places.size() - 1; i++) {
            Place pA = places.get(i);
            Place pB = places.get(i + 1);
            MarkerOptions markerA = new MarkerOptions().position(new LatLng(pA.getLatitude(), pA.getLongitude())).title(pA.getTitle());
            MarkerOptions markerB = new MarkerOptions().position(new LatLng(pB.getLatitude(), pB.getLongitude())).title(pB.getTitle());

            String url = new RouteDrawer().getUrl(markerA.getPosition(), markerB.getPosition(), "walking", getString(R.string.google_maps_key));
            new FetchURL(MapsActivity.this).execute(url, "walking");
        }
    }

    @Override
    public void onTaskDone(Object... values) {
//        if (currentPolyline != null)
//            currentPolyline.remove();
        currentPolyline = mMap.addPolyline((PolylineOptions) values[0]);
    }
}
