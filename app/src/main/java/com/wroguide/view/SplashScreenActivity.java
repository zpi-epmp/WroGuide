package com.wroguide.view;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

import com.wroguide.R;
import com.wroguide.model.Places;
import com.wroguide.model.Routes;
import com.wroguide.presenter.DataLoader;
import com.wroguide.presenter.MyDir;
import com.wroguide.presenter.Utils;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenActivity extends AppCompatActivity {

    private Places places;
    private Routes routes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Stetho.initializeWithDefaults(this);

        Utils.getDatabase();

        final DataLoader loader = new DataLoader();
        //DataUploader uploader = new DataUploader();
        //uploader.uploadPlaces();
        places = loader.loadPlaces();
        routes = loader.loadRoutes();

        final Intent int1 = new Intent(this, MainActivity.class);

        MyDir.dir = getFilesDir();
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                // this code will be executed after 5.5 seconds
                loader.downloadPictures(places, routes);
                int1.putExtra("places", places);
                int1.putExtra("routes", routes);
                startActivity(int1);
                finish();
            }
        }, 5500);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.INTERNET}, 1);
        }

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_GSERVICES) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.WRITE_GSERVICES}, 1);
        }

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        }

    }

}
