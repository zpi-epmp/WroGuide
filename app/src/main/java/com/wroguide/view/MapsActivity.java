package com.wroguide.view;

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
import com.wroguide.R;
import com.wroguide.model.Place;
import com.wroguide.model.PlaceFakeDAO;
import com.wroguide.model.Places;
import com.wroguide.model.RouteFakeDAO;
import com.wroguide.model.Routes;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

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

        for (Place p : routes.getRoutes().get(0).getPlaces().getPlaces()) {
            mMap.addMarker(new MarkerOptions().position(new LatLng(p.getLatitude(), p.getLongitude())).title(p.getTitle()));
            latLngBoundsBuilder.include(new LatLng(p.getLatitude(), p.getLongitude()));
        }

//        LatLng wroclaw = new LatLng(51, 17);
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(wroclaw));
//        CameraPosition cameraPosition = new CameraPosition.Builder().target(wroclaw).zoom(11).build();
        mMap.animateCamera(CameraUpdateFactory.newLatLngBounds(latLngBoundsBuilder.build(),100));
    }
}
