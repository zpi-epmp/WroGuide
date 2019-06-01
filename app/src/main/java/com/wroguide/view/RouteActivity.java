package com.wroguide.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wroguide.R;
import com.wroguide.model.Route;
import com.wroguide.presenter.ListPlacePresenter;

public class RouteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);

        RecyclerView recyclerView = findViewById(R.id.route_places);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Route route = (Route) getIntent().getSerializableExtra("route");

        ListPlacePresenter presenter = new ListPlacePresenter(recyclerView, route.getPlaces(),"trasy");
        recyclerView.setAdapter(presenter.getAdapter());
    }
}
