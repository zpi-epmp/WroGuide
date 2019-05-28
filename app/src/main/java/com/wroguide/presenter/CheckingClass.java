package com.wroguide.presenter;

import com.wroguide.model.Place;
import com.wroguide.model.Places;
import com.wroguide.model.RouteFakeDAO;
import com.wroguide.model.Routes;

public class CheckingClass {
    boolean isInList=false;
    private Places places = new Routes(new RouteFakeDAO()).getRoutes().get(0).getPlaces();
  public boolean CheckPresenceOfObject(String name)  {
     for (Place p:places.getPlaces()){

         if(p.getTitle().equals(name))
         {    isInList=true;
         break;}
     }



      return isInList;
  }

}
