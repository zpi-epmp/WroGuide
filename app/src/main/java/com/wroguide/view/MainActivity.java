package com.wroguide.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.wroguide.R;
import com.wroguide.view.atrakcje.ObjectsActivity;
import com.wroguide.view.atrakcje.RoutesActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override

        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToRoutes(View w) {
        final Intent int1 = new Intent(this, RoutesActivity.class);
        startActivity(int1);
    }
    public void goToObjects(View w) {
        final Intent int2 = new Intent(this, ObjectsActivity.class);
        startActivity(int2);
    }
}







