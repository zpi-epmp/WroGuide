package com.wroguide.presenter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.wroguide.model.Bridge;
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
import java.util.ArrayList;
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

    public void downloadPictures(Places places, Routes routes){
        FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference storageRef = storage.getReference();

        System.out.println("DOWNLOAD PLACES SIZE " + places.getPlaces().size());
        int placesSize = places.getPlaces().size();
        for(int i = 0; i< placesSize; i++) {
            Place p = places.getPlaces().get(i);
            String title = p.getImage();
            StorageReference imageRef = storageRef.child(title);
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
        }

        System.out.println("DOWNLOAD ROUTES SIZE " + routes.getRoutes().size());
        int routesSize = routes.getRoutes().size();
        for(int i = 0; i< routesSize; i++) {
            Route r = routes.getRoutes().get(i);
            String title = r.getImage();
            StorageReference imageRef = storageRef.child(title);
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
        }

    }

    public void downloadPictures2(){
        FirebaseDatabase database = Utils.getDatabase();
        DatabaseReference reference = database.getReference("images");
        ValueEventListener listener = new ValueEventListener(){
            public void onDataChange(DataSnapshot snapshot) {
                List<String> imageNamesList = new ArrayList<>();
                for(DataSnapshot ds : snapshot.getChildren()){
                    String imageName = ds.getValue(String.class);
                    imageNamesList.add(imageName);
                }
                FirebaseStorage storage = FirebaseStorage.getInstance();
                StorageReference storageRef = storage.getReference();
                for(String title : imageNamesList){
                    StorageReference imageRef = storageRef.child(title);
                    final File localFile = new File(MyDir.dir, title);
                    System.out.println("TRYING TO DOWNLOAD " + localFile.getAbsolutePath());
                    if(!localFile.exists()) {
                        imageRef.getFile(localFile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                            @Override
                            public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                                System.out.println("FILE " + localFile.getAbsolutePath() + " DOWNLOADED");
                                // Local temp file has been created
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception exception) {
                                System.out.println("FILE " + localFile.getAbsolutePath() + " DOWNLOAD FAILURE");
                                // Handle any errors
                            }
                        });
                    }
                }
            }

            public void onCancelled(DatabaseError error) {
                error.toException().printStackTrace();
            }
        };
        reference.addListenerForSingleValueEvent(listener);
    }

}
