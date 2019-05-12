package com.wroguide.view;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.wroguide.R;
import com.wroguide.presenter.ListPlacePresenter;

public class PlaceListFilteredActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_activity);

       int choice =  getIntent().getIntExtra("choice",0);
        String objectName = getIntent().getStringExtra("objectName");

        RecyclerView recyclerView = findViewById(R.id.places);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ListPlacePresenter presenter = new ListPlacePresenter(recyclerView, choice,objectName);
        recyclerView.setAdapter(presenter.getAdapter());
    }


}
