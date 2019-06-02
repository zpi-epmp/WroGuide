package com.wroguide.view;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wroguide.R;
import com.wroguide.model.Places;
import com.wroguide.model.Routes;
import com.wroguide.presenter.ListRoutePresenter;
import com.wroguide.presenter.MyAdapter;

import java.util.ArrayList;

public class RouteListActivity extends AppCompatActivity {
    ListRoutePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.routes_activity);

        RecyclerView recyclerView = findViewById(R.id.routes);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        int changeInfo = getIntent().getIntExtra("changedInfo", 0);
        if (changeInfo != 0) {
            Routes routes = (Routes) getIntent().getSerializableExtra("routes");

                int h = routes.getRoutes().size();
                presenter = new ListRoutePresenter(recyclerView, routes);
            }
        else
            {
                presenter = new ListRoutePresenter(recyclerView);
            }
            recyclerView.setAdapter(presenter.getAdapter());
        }
    }

