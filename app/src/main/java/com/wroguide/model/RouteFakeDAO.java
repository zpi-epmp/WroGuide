package com.wroguide.model;

import com.wroguide.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RouteFakeDAO implements RouteDAO {
    static final String LOREM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
    //TODO: LOREM jest wpisane na sztywno w "description" obiektu

    List<Route> routes;

    public RouteFakeDAO() {

        routes = new ArrayList<>();
        Route bridges = new Route(Integer.toString(R.drawable.most),
                "Trasa prowadząca przez najbardziej znane mosty wrocławskie - zarówno zabytkowe jak i te o największym znaczeniu komunikacyjnym", "Trasa: Mosty");
        List<Place> bridgesPlaces = new ArrayList<>();
        bridgesPlaces.add(new Bridge(Integer.toString(R.drawable.grun1),
                "Most wiszący przez rzekę Odrę o konstrukcji stalowej, nitowanej. " +
                        "Elementy nośne wsparte są na pylonach murowanych z cegły klinkierowej i oblicowanych granitem, o wysokości około 20 m.",
                "Most Grunwaldzki", LOREM, 51.109497, 17.052549));
        bridgesPlaces.add(new Bridge(Integer.toString(R.drawable.tums2),
                "Dwuprzęsłowy stalowy, nitowany most zbudowany w roku 1889 nad północną odnogą Odry pomiędzy Ostrowem Tumskim a Wyspą Piasek.",
                "Most Tumski", LOREM, 51.114716, 17.042225));
        bridgesPlaces.add(new Bridge(Integer.toString(R.drawable.mile1),
                "Most wantowy, łączący osiedla Popowice i Osobowice, jest częścią obwodnicy śródmiejskiej Wrocławia. " +
                        "Całkowita długość 924m, wysokość pylonów 50m.",
                "Most Milenijny", LOREM, 51.134091, 16.993900));
        bridgesPlaces.add(new Bridge(Integer.toString(R.drawable.redz2),
                "Drogowy most wantowy, będący częścią autostrady A8. Przeprawa nad Odrą oraz nad całą Wyspą Rędzińską. " +
                        "Żelbetowa konstrukcja zawieszona jest za pomocą 160 want na jednym pylonie o wysokości 122m.",
                "Most Rędziński", LOREM, 51.157573, 16.960763));
        Places bridgesPlaces2 = new Places();
        bridgesPlaces2.setPlaces(bridgesPlaces);
        bridges.setPlaces(bridgesPlaces2);

        Route tenementHouses = new Route(Integer.toString(R.drawable.kamienica),
                "Trasa prowadząca przez najwyższe budynki we Wrocławiu.", "Trasa: Najwyższe we Wrocławiu");
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
    public Optional<Route> get(int id) {
        return Optional.ofNullable(routes.get(id));
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
