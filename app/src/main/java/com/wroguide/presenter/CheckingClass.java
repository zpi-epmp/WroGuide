package com.wroguide.presenter;

import com.wroguide.model.Place;
import com.wroguide.model.Places;

public class CheckingClass {
    boolean isInList=false;

  public boolean CheckPresenceOfObject(String name, Places places)  {
     for (Place p:places.getPlaces()){

//         Log.d("placesToFilter", p.getTitle());
//         Log.d("placesToFilter", p.getTitle().toLowerCase());
//         Log.d("placesToFilter", name);
//         Log.d("placesToFilter", name.toLowerCase());
         if(p.getTitle().toLowerCase().contains(name.toLowerCase())) {
             isInList=true;
             break;
         }
     }



      return isInList;
  }

}
