package com.wroguide.model;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.List;
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
        final List<Place> places = new ArrayList<>();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        //database.setPersistenceEnabled(true);
        DatabaseReference reference = database.getReference("bridges_pl");
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
