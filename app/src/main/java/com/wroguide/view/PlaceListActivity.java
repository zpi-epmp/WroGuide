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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuItem1: {

                Intent intent2 = new Intent(this, PlaceListFilterActivity.class);
                this.startActivity(intent2);

                return true;
            }
        }

        return true;
    }

}

