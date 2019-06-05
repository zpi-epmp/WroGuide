package com.wroguide.presenter;

import static org.junit.Assert.*;
import com.wroguide.model.Place;
import com.wroguide.model.Places;
import com.wroguide.presenter.CheckingClass;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckingClassTest {

    private CheckingClass checkingClass;

    @Before
    public void setUp() {
        checkingClass = new CheckingClass();
    }

    @Test
    public void shudSayThatNameIsInList(){
        Place place = new Place();
        place.title = "name";
        List<Place> places = new ArrayList<>();
        places.add(place);
        Places places2 = new Places(places);
        Assert.assertTrue(checkingClass.CheckPresenceOfObject("name", places2));
    }

    @Test
    public void shoudSayThatNameIsNotInList(){
        Place place = new Place();
        place.title = "eman";
        List<Place> places = new ArrayList<>();
        places.add(place);
        Places places2 = new Places(places);
        Assert.assertFalse(checkingClass.CheckPresenceOfObject("name", places2));
    }

    @Test
    public void shoudSayThatNameIsNotInList2(){
        List<Place> places = new ArrayList<>();
        Places places2 = new Places(places);
        Assert.assertFalse(checkingClass.CheckPresenceOfObject("name", places2));
    }

    @Test(expected = Exception.class)
    public void shouldThrowException(){
        List<Place> places = null;
        Places places2 = new Places(places);
        checkingClass.CheckPresenceOfObject("name", places2);
    }

    @Test(expected = Exception.class)
    public void shouldThrowException2(){
        Place place = null;
        List<Place> places = new ArrayList<>();
        places.add(place);
        Places places2 = new Places(places);
        checkingClass.CheckPresenceOfObject("name", places2);
    }

}