package com.wroguide.presenter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.wroguide.model.DAO;
import com.wroguide.model.Place;
import com.wroguide.model.PlaceDAO;
import com.wroguide.model.PlaceDatabaseDAO;
import com.wroguide.model.Places;
import com.wroguide.model.Route;
import com.wroguide.model.RouteDAO;
import com.wroguide.model.RouteDatabaseDAO;
import com.wroguide.model.Routes;

import java.io.File;
import java.sql.SQLOutput;
import java.util.List;

public class DataLoader {

    public static Places places;

    public Places loadPlaces(){
        PlaceDatabaseDAO dao = new PlaceDatabaseDAO();
        List<Place> list = dao.getAll();
        Places places = new Places();
        places.setPlaces(list);
        return places;
    }

    public Routes loadRoutes(){
        RouteDatabaseDAO dao = new RouteDatabaseDAO();
        List<Route> list = dao.getAll();
        Routes routes = new Routes();
        routes.setRoutes(list);
        return routes;
    }

    public void downloadPictures(Places places){
        System.out.println("DOWNLOAD PLACES SIZE " + places.getPlaces().size());
        FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference storageRef = storage.getReference();
        for(Place p : places.getPlaces()) {
            String title = p.getImage();
            StorageReference imageRef = storageRef.child(title);
            try {
                File localFile = new File(MyDir.dir, title);
                System.out.println("TRYING TO DOWNLOAD " + localFile.getAbsolutePath());
                if(!localFile.exists()) {
                    imageRef.getFile(localFile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            System.out.println("FILE DOWNLOADED");
                            // Local temp file has been created
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception exception) {
                            System.out.println("DOWNLOAD FAILURE");
                            // Handle any errors
                        }
                    });
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
