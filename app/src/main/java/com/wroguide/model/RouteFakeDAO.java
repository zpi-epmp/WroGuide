package com.wroguide.model;

import com.wroguide.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RouteFakeDAO implements RouteDAO {

    List<Route> routes;

    public RouteFakeDAO() {
        routes = new ArrayList<>();
        Route bridges = new Route(Integer.toString(R.drawable.most),
                "Zobacz najsłynniejsze wrocławskie mosty...", "Trasa: Mosty");
        List<Place> bridgesPlaces = new ArrayList<>();
        bridgesPlaces.add(new Bridge(Integer.toString(R.drawable.most), "1", "1", "1"));
        Places bridgesPlaces2 = new Places();
        bridgesPlaces2.setPlaces(bridgesPlaces);
        bridges.setPlaces(bridgesPlaces2);
        Route tenementHouses = new Route(Integer.toString(R.drawable.kamienica),
                "Zobacz kamienice, na które warto zwrócić uwagę...", "Trasa: Kamienice");
        List<Place> tenementHousesPlaces = new ArrayList<>();
        tenementHousesPlaces.add(new Building(Integer.toString(R.drawable.kamienica),
                "Ten opis jest krótki", "Ten tytuł jest krótki", "..."));
        Places tenementHousesPlaces2 = new Places();
        tenementHousesPlaces2.setPlaces(tenementHousesPlaces);
        tenementHouses.setPlaces(tenementHousesPlaces2);

        routes.add(bridges);
        routes.add(tenementHouses);
    }

    @Override
    public Optional<Route> get(long id) {
        return null;
    }

    @Override
    public List<Route> getAll() {
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
