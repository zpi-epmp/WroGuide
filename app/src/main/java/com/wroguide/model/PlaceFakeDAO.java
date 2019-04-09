package com.wroguide.model;

import com.wroguide.R;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class PlaceFakeDAO implements PlaceDAO {

    List<Place> places;

    public PlaceFakeDAO() {
        places = new ArrayList<>();
        Bridge bridge = new Bridge(Integer.toString(R.drawable.most),
                "Ten opis jest długi, bo chcę zobaczyć jak to będzie wyglądało przy długich opisach, " +
                        "bo w sumie to nie wiem czy będzie ładnie", "Ale potem i tak nie będziemy dawać" +
                        "takich długich opisów, bo to jest przecież tytuł, ale i tak nie zaszkodzi sprawdzić", "...");
        Building tenementHouse = new Building(Integer.toString(R.drawable.kamienica),
                "Ten opis jest krótki", "Ten tytuł jest krótki", "...");
        places.add(bridge);
        places.add(tenementHouse);
    }

    @Override
    public Optional<Place> get(long id) {
        return null;
    }

    @Override
    public List<Place> getAll() {
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
