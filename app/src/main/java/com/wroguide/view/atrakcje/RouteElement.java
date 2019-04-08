package com.wroguide.view.atrakcje;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;

import com.wroguide.R;

import java.util.Random;

import static android.support.v7.content.res.AppCompatResources.getDrawable;

public class RouteElement {



    private String routeTitle;
    private String routeContent;
    private int picture;

    //private Uri picture;

    // statyczne tablice, na podstawie których zostaną uzupełnione obiekty
   // private static Uri[] rPictures = {Uri.parse("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Most_Pi%C5%82sudskiego_w_Krakowie.jpg/1200px-Most_Pi%C5%82sudskiego_w_Krakowie.jpg"),Uri.parse("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Most_Pi%C5%82sudskiego_w_Krakowie.jpg/1200px-Most_Pi%C5%82sudskiego_w_Krakowie.jpg"), };


    private static int[] rPictures ={R.drawable.most, R.drawable.kamienica};
    private static String[] rTitles = {"Trasa: Mosty",
            "Trasa: Zabytkowe kamienice"};

    private static String[] rContents = {"Zobacz najsłynniejsze wrocławskie mosty...",
            "Zobacz kamienice, na które warto zwrócić uwagę..."};

    public RouteElement(int i) {


        // ustawiamy tytuł i treść artykułu
        routeTitle = rTitles[i];
        routeContent = rContents[i];
        picture=rPictures[i];
    }

    public String getTitle() {
        return routeTitle;
    }

    public String getContent() {
        return routeContent;
    }
    public int getPicture() {
        return picture;
    }
}

