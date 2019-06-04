package com.wroguide.view;

import android.app.Activity;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.facebook.stetho.Stetho;
import com.google.firebase.database.FirebaseDatabase;
import com.wroguide.R;
import com.wroguide.model.Places;
import com.wroguide.model.Routes;
import com.wroguide.presenter.DataLoader;
import com.wroguide.presenter.DataUploader;
import com.wroguide.presenter.MyDir;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenActivity extends AppCompatActivity {

    private Places places;
    private Routes routes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Stetho.initializeWithDefaults(this);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        database.setPersistenceEnabled(true);

        final DataLoader loader = new DataLoader();
        DataUploader uploader = new DataUploader();
        uploader.uploadPlaces();
        places = loader.loadPlaces();
        routes = loader.loadRoutes();

        final Intent int1 = new Intent(this, MainActivity.class);

        MyDir.dir = getFilesDir();
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                // this code will be executed after 5 seconds
                loader.downloadPictures(places);
                int1.putExtra("places", places);
                int1.putExtra("routes", routes);
                startActivity(int1);
            }
        }, 5000);
    }

}
