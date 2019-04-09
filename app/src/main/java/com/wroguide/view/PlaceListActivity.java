package com.wroguide.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.wroguide.R;
import com.wroguide.presenter.ListElementAdapter;
import com.wroguide.presenter.ListPlacePresenter;


public class PlaceListActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.object_activity);

            RecyclerView recyclerView = findViewById(R.id.places);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            ListPlacePresenter presenter = new ListPlacePresenter(recyclerView);
            recyclerView.setAdapter(presenter.getAdapter());
        }

    }

