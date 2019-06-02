package com.wroguide.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.wroguide.R;
import com.wroguide.model.Place;
import com.wroguide.model.Places;
import com.wroguide.presenter.ListPlacePresenter;


public class PlaceListFilteredActivity extends AppCompatActivity {
    Places places;
    ListPlacePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_activity);


        int choice = getIntent().getIntExtra("choice", 0);
        places = (Places) getIntent().getSerializableExtra("places");
        Places placestoFilter = new Places(places.getPlaces());
        String objectName = getIntent().getStringExtra("objectName");

        RecyclerView recyclerView = findViewById(R.id.places);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
       

        presenter = new ListPlacePresenter(recyclerView, placestoFilter, choice, objectName);
        recyclerView.setAdapter(presenter.getAdapter());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menufilter, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuItemfilter1: {
                backToAllObjects();
                return true;
            }
        }
        return true;
    }

    public void backToAllObjects() {
        Places placesFiltered = new Places(presenter.getAllPlaces());
        for (Place p : places.getPlaces()) {
            boolean b1 = p.selected;
            for (Place pf : placesFiltered.getPlaces()) {
                if (p.getTitle().equals(pf.getTitle())) {
                    boolean b2 = pf.selected;
                    b1=b2;
                }
            }
        }


        final Intent int5 = new Intent(this, PlaceListActivity.class);
        int5.putExtra("places", places);
        int5.putExtra("firstLoad", 1);
        startActivity(int5);
    }


}











