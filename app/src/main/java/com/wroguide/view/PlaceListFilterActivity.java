package com.wroguide.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;
import com.wroguide.R;
import com.wroguide.model.Place;
import com.wroguide.model.Places;
import com.wroguide.presenter.CheckingClass;

import java.io.Serializable;
import java.util.List;


public class PlaceListFilterActivity extends AppCompatActivity {


    AutoCompleteTextView inputTekst;
    int choice;
    String objectName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        inputTekst= findViewById(R.id.textInput);

        inputTekst.setVisibility(View.VISIBLE);

        }





    public void goToFiltered(View w) {

        Places places = (Places)getIntent().getSerializableExtra("places");
        objectName=inputTekst.getText().toString();
        CheckingClass checker=new CheckingClass();
        boolean checkInfo=checker.CheckPresenceOfObject(objectName, places);
        if(checkInfo){
            final Intent int4 = new Intent(this, PlaceListFilteredActivity.class);
        int4.putExtra("choice",3);
        int4.putExtra("objectName",objectName);
            int4.putExtra("places", places);
            startActivity(int4);
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(), getResources().getString(R.string.ToastText), Toast.LENGTH_LONG);
            toast.show();
            inputTekst.setText("");
        }
    }
}








