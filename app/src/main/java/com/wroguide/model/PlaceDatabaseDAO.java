package com.wroguide.model;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.wroguide.presenter.DataLoader;
import com.wroguide.presenter.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

/**
 * Created by Piotrek on 07.04.2019.
 */
public class PlaceDatabaseDAO implements PlaceDAO {

    @Override
    public Optional<Place> get(int id) {
        return null;
    }

    @Override
    public List<Place> getAll() {
        String lang = Locale.getDefault().getLanguage();
        if(!lang.equals("pl") && !lang.equals("de")){
            lang = "en";
        }

        final List<Place> places = new ArrayList<>();

        FirebaseDatabase database = Utils.getDatabase();
        DatabaseReference reference = database.getReference("bridges_" + lang);
        ValueEventListener listener = new ValueEventListener(){
            public void onDataChange(DataSnapshot snapshot) {
                for(DataSnapshot ds : snapshot.getChildren()){
                    Place bridge = ds.getValue(Bridge.class);
                    places.add(bridge);
                }
            }

            public void onCancelled(DatabaseError error) {
                error.toException().printStackTrace();
            }
        };
        reference.addListenerForSingleValueEvent(listener);

        DatabaseReference reference2 = database.getReference("tenements_" + lang);
        ValueEventListener listener2 = new ValueEventListener(){
            public void onDataChange(DataSnapshot snapshot) {
                for(DataSnapshot ds : snapshot.getChildren()){
                    Place building = ds.getValue(Building.class);
                    places.add(building);
                }
            }

            public void onCancelled(DatabaseError error) {
                error.toException().printStackTrace();
            }
        };
        reference2.addListenerForSingleValueEvent(listener2);

        DatabaseReference reference3 = database.getReference("gems_" + lang);
        ValueEventListener listener3 = new ValueEventListener(){
            public void onDataChange(DataSnapshot snapshot) {
                for(DataSnapshot ds : snapshot.getChildren()){
                    Place building = ds.getValue(Construction.class);
                    places.add(building);
                }
            }

            public void onCancelled(DatabaseError error) {
                error.toException().printStackTrace();
            }
        };
        reference3.addListenerForSingleValueEvent(listener3);
        return places;
    }

    @Override
    public void save(Place place) {

    }

    @Override
    public void update(Place place, String[] params) {

    }

    @Override
    public void delete(Place place) {

    }
}
