package com.wroguide.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wroguide.R;

public class MainActivity extends AppCompatActivity {

    @Override

        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToRoutes(View w) {
        final Intent int1 = new Intent(this, RouteListActivity.class);
        startActivity(int1);
    }

    public void goToObjects(View w) {
        final Intent int2 = new Intent(this, PlaceListActivity.class);
        startActivity(int2);
    }

    public void goToMap(View w) {
        final Intent int3 = new Intent(this, MapsActivity.class);
        startActivity(int3);
    }
}







