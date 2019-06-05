package com.wroguide.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wroguide.R;
import com.wroguide.model.Route;
import com.wroguide.presenter.ListPlacePresenter;

public class RouteActivity extends AppCompatActivity {

     private Route route;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);

        RecyclerView recyclerView = findViewById(R.id.route_places);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        route = (Route) getIntent().getSerializableExtra("route");

        ListPlacePresenter presenter = new ListPlacePresenter(recyclerView, route.getPlaces(),"trasy");
        recyclerView.setAdapter(presenter.getAdapter());
    }

    public void goToMap(View w) {
        final Intent int1 = new Intent(this, MapsActivity.class);
        int1.putExtra("places", route.getPlaces());
        startActivity(int1);
    }
}
