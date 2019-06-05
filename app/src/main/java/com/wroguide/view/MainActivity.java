package com.wroguide.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.wroguide.R;
import com.wroguide.model.Places;
import com.wroguide.model.Routes;
import com.wroguide.presenter.ModelUpdater;

public class MainActivity extends AppCompatActivity {

    private Places places;
    private Routes routes;
    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();

        places = (Places) getIntent().getSerializableExtra("places");
        routes = (Routes) getIntent().getSerializableExtra("routes");

        ModelUpdater.routesList = routes.getRoutes();

    }

    public void goToRoutes(View w) {
        final Intent int1 = new Intent(this, RouteListActivity.class);
        int1.putExtra("routes", routes);
        startActivity(int1);
    }

    public void goToObjects(View w) {
        final Intent int2 = new Intent(this, PlaceListActivity.class);
        int2.putExtra("places", places);
        startActivity(int2);
    }

    public void goToMap(View w) {
        final Intent int3 = new Intent(this, MapsActivity.class);
        int3.putExtra("routes", routes);
        startActivity(int3);
    }

    public static Context getAppContext() {
        return context;
    }
}







