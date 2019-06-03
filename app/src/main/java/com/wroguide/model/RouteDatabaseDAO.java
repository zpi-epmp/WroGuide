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
public class RouteDatabaseDAO implements RouteDAO {
    @Override
    public Optional<Route> get(int id) {
        return null;
    }

    @Override
    public List<Route> getAll() {
        final List<Route> routes = new ArrayList<>();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        //database.setPersistenceEnabled(true);
        DatabaseReference reference = database.getReference("routes");
        ValueEventListener listener = new ValueEventListener(){
            public void onDataChange(DataSnapshot snapshot) {
                for(DataSnapshot ds : snapshot.getChildren()){
                    Route route = ds.getValue(Route.class);
                    routes.add(route);
                }
            }

            public void onCancelled(DatabaseError error) {
                error.toException().printStackTrace();
            }
        };
        reference.addListenerForSingleValueEvent(listener);
        return routes;
    }

    @Override
    public void save(Route route) {

    }

    @Override
    public void update(Route route, String[] params) {

    }

    @Override
    public void delete(Route route) {

    }
}
