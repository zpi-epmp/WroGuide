package com.wroguide.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AutoCompleteTextView;

import com.wroguide.R;
import com.wroguide.model.Places;
import com.wroguide.model.RouteCreator;
import com.wroguide.model.Routes;
import com.wroguide.presenter.ModelUpdater;

import java.io.Serializable;

public class RoadCreateActivity extends AppCompatActivity {

    AutoCompleteTextView inputTekst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roadcreate);

        inputTekst= findViewById(R.id.textInput2);
        inputTekst.setVisibility(View.VISIBLE);

    }

    public void goToRoads(View v){
        Places places = (Places) getIntent().getSerializableExtra("places");
        ModelUpdater modelUpd=new ModelUpdater();

        //wyznaczanie najkrótszej trasy
        RouteCreator routeCreator = new RouteCreator(places);
        Places placesShortestRoute = routeCreator.shortestPath();

        Routes routes=modelUpd.addNewRoute(placesShortestRoute, inputTekst.getText().toString());




        final Intent int7 = new Intent(this, RouteListActivity.class);
        int7.putExtra("changedInfo", 1);
        int7.putExtra("routes", (Serializable) routes);
        startActivity(int7);

    }






}
