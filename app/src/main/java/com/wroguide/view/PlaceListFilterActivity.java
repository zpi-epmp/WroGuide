package com.wroguide.view;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import com.wroguide.R;



public class PlaceListFilterActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    TextInputLayout inputTekst;
    int choice;
    String objectName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        spinner = (Spinner) findViewById(R.id.spinner);
        inputTekst= findViewById(R.id.textInput);
        inputTekst.setVisibility(View.INVISIBLE);
        Resources res = getResources();
        String[] filterOptions = res.getStringArray(R.array.filterOptions);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this,
                R.array.filterOptions,
                R.layout.my_spinner);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch(position)
        {
            case 0:
                choice=0;

                break;
            case 1:
                choice=1;

                break;
            case 2:
                inputTekst.setVisibility(View.VISIBLE);
                choice=2;

                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        choice=0;

    }


    public void goToFiltered(View w) {

        final Intent int4 = new Intent(this, PlaceListFilteredActivity.class);
        objectName=inputTekst.getEditText().getText().toString();
        int4.putExtra("choice",choice);
        int4.putExtra("objectName",objectName);
        startActivity(int4);
    }
}








