package com.wroguide.view;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.wroguide.R;
import com.wroguide.model.FetchURL;
import com.wroguide.model.Place;
import com.wroguide.model.PlaceFakeDAO;
import com.wroguide.model.Places;
import com.wroguide.model.Route;
import com.wroguide.model.RouteFakeDAO;
import com.wroguide.model.Routes;
import com.wroguide.model.TaskLoadedCallback;
import com.wroguide.presenter.RouteDrawer;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, TaskLoadedCallback {

    private GoogleMap mMap;
    private Polyline currentPolyline;

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
        Routes routes = new Routes(new RouteFakeDAO());
        LatLngBounds.Builder latLngBoundsBuilder = new LatLngBounds.Builder();

        for (Route r : routes.getRoutes()) {

            Places places = r.getPlaces();

            for (int i = 0; i < places.getPlaces().size() - 1; i++) {
                Place pA = places.getPlaces().get(i);
                Place pB = places.getPlaces().get(i + 1);
                MarkerOptions markerA = new MarkerOptions().position(new LatLng(pA.getLatitude(), pA.getLongitude())).title(pA.getTitle());
                MarkerOptions markerB = new MarkerOptions().position(new LatLng(pB.getLatitude(), pB.getLongitude())).title(pB.getTitle());
                mMap.addMarker(markerA);

//                String url = new RouteDrawer().getUrl(markerA.getPosition(), markerB.getPosition(), "walking", getString(R.string.google_maps_key));
//                new FetchURL(MapsActivity.this).execute(url, "walking");

                latLngBoundsBuilder.include(new LatLng(pA.getLatitude(), pA.getLongitude()));
                if (i == places.getPlaces().size() - 2) {
                    mMap.addMarker(markerB);
                    latLngBoundsBuilder.include(new LatLng(pB.getLatitude(), pB.getLongitude()));
                }
            }
        }
        mMap.animateCamera(CameraUpdateFactory.newLatLngBounds(latLngBoundsBuilder.build(),100));

        //rysowanie trasy na mapie tylko dla pierwszej trasy:
        Places places = routes.getRoutes().get(0).getPlaces();
        for (int i = 0; i < places.getPlaces().size() - 1; i++) {
            Place pA = places.getPlaces().get(i);
            Place pB = places.getPlaces().get(i + 1);
            MarkerOptions markerA = new MarkerOptions().position(new LatLng(pA.getLatitude(), pA.getLongitude())).title(pA.getTitle());
            MarkerOptions markerB = new MarkerOptions().position(new LatLng(pB.getLatitude(), pB.getLongitude())).title(pB.getTitle());

            String url = new RouteDrawer().getUrl(markerA.getPosition(), markerB.getPosition(), "walking", getString(R.string.google_maps_key));
            new FetchURL(MapsActivity.this).execute(url, "walking");
        }
        //koniec rysowania

    }

    @Override
    public void onTaskDone(Object... values) {
//        if (currentPolyline != null)
//            currentPolyline.remove();
        currentPolyline = mMap.addPolyline((PolylineOptions) values[0]);
    }
}
