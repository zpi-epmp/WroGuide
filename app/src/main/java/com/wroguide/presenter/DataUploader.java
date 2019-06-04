package com.wroguide.presenter;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.wroguide.model.Bridge;
import com.wroguide.model.Building;

public class DataUploader {

    public void uploadPlaces(){
       uploadBridgesPl();
       //uploadTenementHousesPl();
    }

    private void uploadBridgesPl(){
        String url = "";
        String image = "";
        String title = "";
        String content = "";
        String description = "";
        double latitude = 0;
        double longitude = 0;

        //MOST GRUNWALDZKI PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/grun1.jpg?alt=media&token=09b10b9b-2648-481f-8cda-7d8e4f099cf2";
        image = "grun1.jpg";
        title = "Most Grunwaldzki";
        content = "Most Grunwaldzki we Wrocławiu to most wiszący przez rzekę Odrę o konstrukcji stalowej, nitowanej.";
        description = "Przeszkoda: Odra" +
                "\nDługość: 112,5 m" +
                "\nLiczba przęseł: 1 – wiszące" +
                "\nData budowy: 1908-1910" +
                "\nProjektant: Richard Plüddemann (architektura), Alfred von Scholtz i Ernst Günthl (konstrukcja), Martin Mayer i Robert Weyrauch (projekt konkursowy)" +
                "\nOpis: Most Grunwaldzki we Wrocławiu to most wiszący przez rzekę Odrę o konstrukcji stalowej, nitowanej. Elementy nośne wsparte są na pylonach murowanych z cegły klinkierowej i oblicowanych granitem, o wysokości około 20 m. Most powstał w latach 1908-1910 w ramach budowy nowej trasy stanowiącej połączenie między centrum miasta a osiedlami i instytucjami wschodniego Wrocławia. Most początkowo nazywany był mostem Carskim (niem. Kaiserbrücke). Po zakończeniu drugiej wojny światowej nadano mu nazwę mostu Grunwaldzkiego.";
        latitude = 51.109497;
        longitude = 17.052549;
        Bridge bridge1 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST POKOJU PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/pokoju.jpg?alt=media&token=f98a7ec3-b5cf-4050-b50a-fe9218d488a8";
        image = "pokoju.jpg";
        title = "Most Pokoju";
        content = "Most Pokoju zrealizowany został w miejsce zniszczonego w trakcie trwania drugiej wojny światowej mostu Lessinga.";
        description = "Przeszkoda: Odra" +
                "\nDługość: 125,3 m" +
                "\nLiczba przęseł: 3" +
                "\nData budowy: 1954-1959" +
                "\nProjektant: Jan Kmita" +
                "\nOpis: Most Pokoju zrealizowany został w miejsce zniszczonego w trakcie trwania drugiej wojny światowej mostu Lessinga. Pierwotny most był konstrukcją czteroprzesłową kratownicową podpartą na kamiennych filarach. Nowa konstrukcja zrealizowana została jako obiekt trójprzęsłowy. Każde przęsło stanowią dwie konstrukcje kablobetonowe oparte są na wspólnych podporach. Podpory pośrednie zrealizowane zostały jako betonowe filary. Od roku 1966 r. most nosi nazwę most Pokoju. Nazwa miała korespondować z Pomnikem Powrotu do Macierzy Ziem Zachodnich i Północnych. Niestety pomnik nigdy nie został wybudowany. Na północnym przyczółku pozostała tablica pamiątkowa, która miała upamiętniać ten pomnik.";
        latitude = 51.111739;
        longitude = 17.049236;
        Bridge bridge2 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST MILENIJNY PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/mile1.jpg?alt=media&token=fafd3892-f7e1-4d97-b915-b4990cfcae5a";
        image = "mile1.jpg";
        title = "Most Milenijny";
        content = "Most Milenijny to most wantowy (podwieszany) wybudowany nad Odrą.";
        description = "Przeszkoda: Odra i Zimowisko Osobowice" +
                "\nDługość: 923,5 m" +
                "\nLiczba przęseł: 3" +
                "\nData budowy: 2002-2004" +
                "\nProjektant: Piotr Wanecki" +
                "\ngłówny projektant: Marek Jagiełło" +
                "\nOpis: Most Milenijny to most wantowy (podwieszany) wybudowany nad Odrą. Stanowi od fragment drogi krajowej nr 5. Konstrukcja oparta jest na dwóch pylonach w kształcie litery H. Długość właściwej przeprawy nad rzeką wynosi 289 m. Budowa mostu kosztowała 160 mln zł.";
        latitude = 51.134091;
        longitude = 16.993900;
        Bridge bridge3 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST RĘDZIŃSKI PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/redz2.jpg?alt=media&token=4fea8e60-e150-4949-b461-b130c757aa03";
        image = "redz2.jpg";
        title = "Most Rędziński";
        content = "Most Rędziński to drogowy obiekt wantowy wybudowany w ciągu Autostradowej Obwodnicy Wrocławia.";
        description = "Przeszkoda: Odra, Wyspa Rędzińska" +
                "\nDługość: 612 m" +
                "\nLiczba przęseł: 4" +
                "\nData budowy: 2008-2011" +
                "\nProjektant: prof. dr hab. inż. Jan Biliszczuk" +
                "\nOpis: Most Rędziński to drogowy obiekt wantowy wybudowany w ciągu Autostradowej Obwodnicy Wrocławia. Konstrukcja obiektu zawieszona jest za pomocą 160 want o łącznej długości 25 km na pojedynczym pylonie. Wysokość obiektu to 122m. Jest to najwyższy obiekt wantowy w Polsce.";
        latitude = 51.157573;
        longitude = 16.960763;
        Bridge bridge4 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST ZWIERZYNIECKI PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/zwierzyniecki.jpg?alt=media&token=e157eb30-cedb-4d21-8159-02a58b14025c";
        image = "zwierzyniecki,jpg";
        title = "Most Zwierzyniecki";
        content = "Most ten zlokalizowany jest w bezpośrednim sąsiedztwie Ogradu Zoologicznego (od którego wywodzi się jego współczesna nazwa).";
        description = "Przeszkoda: Stara Odra" +
                "\nDługość: 62 m" +
                "\nLiczba przęseł: 1" +
                "\nData budowy: 1895-1897" +
                "\nProjektant: Karl Klimm, Richard Plüddemann, A. Fruhwirth" +
                "\nOpis: Most ten zlokalizowany jest w bezpośrednim sąsiedztwie Ogradu Zoologicznego (od którego wywodzi się jego współczesna nazwa). Przeprawa w tym miejscu funkcjonowała już od 1655 r. Podczas epidemii dżumy na moście ustanowiony został punkt przepustkowy. Obecny obiekt wybudowany został pod koniec XIX w. Jest to konstrukcja stalowa kratownicowa oparta na granitowych przyczółkach. Konstrukcja nawierzchni podwieszona jest do łukowych kratownic za pomocą wieszaków. Ozdobę obiektu stanowią cztery secesyjne obiekty z czerwonego piaskowca.";
        latitude = 51.108056;
        longitude = 17.07;
        Bridge bridge5 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST TUMSKI PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/tums2.jpg?alt=media&token=6a515106-0a89-4589-9fa5-0f7a3fac1121";
        image = "tums2.jpg";
        title = "Most Tumski";
        content = "Zwany także mostem zakochanych stalowy nitowany most łączący Ostrów Tumski z Wyspą Piasek.";
        description = "Przeszkoda: Odra" +
                "\nDługość: 52,19 m" +
                "\nLiczba przęseł: 2" +
                "\nData budowy: 1889" +
                "\nProjektant: Alfred von Scholtz" +
                "\nOpis: Zwany także mostem zakochanych stalowy nitowany most łączący Ostrów Tumski z Wyspą Piasek. Konstrukcje mostowe w tym miejscu budowano już od XII wieku. Obecny obiekt wybudowano przy aktywnym udziale okolicznych rzemieślników przy wykorzystaniu rzeki do transportu materiałów.";
        latitude = 51.114716;
        longitude = 17.042225;
        Bridge bridge6 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST ŚW. KLARY PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/klary.jpg?alt=media&token=a42f0720-baf6-419d-b55c-d5798c9f72f1";
        image = "klary.jpg";
        title = "Most Św. Klary";
        content = "Most został wybudowany nad kanałami rynien roboczych nieistniejących już młynów wodnych.";
        description = "Przeszkoda: Upust Klary" +
                "\nDługość: 20,6 m" +
                "\nLiczba przęseł: 2" +
                "\nData budowy: 1992" +
                "\nOpis: Most został wybudowany nad kanałami rynien roboczych nieistniejących już młynów wodnych. Konstrukcję nośną mostu stanowią stalowe dwuteowniki. Pomost roboczy wraz z barierkami jest konstrukcją drewnianą.";
        latitude = 51.116667;
        longitude = 17.039167;
        Bridge bridge7 = new Bridge(image, content, title, description, latitude, longitude, url);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference();
        reference.child("bridges_pl").child("1").setValue(bridge1);
        reference.child("bridges_pl").child("2").setValue(bridge2);
        reference.child("bridges_pl").child("3").setValue(bridge3);
        reference.child("bridges_pl").child("4").setValue(bridge4);
        reference.child("bridges_pl").child("5").setValue(bridge5);
        reference.child("bridges_pl").child("6").setValue(bridge6);
        reference.child("bridges_pl").child("7").setValue(bridge7);
    }

    private void uploadTenementHousesPl(){
        String image = "";
        String title = "";
        String content = "";
        String description = "";
        double latitude = 0;
        double longitude = 0;

        //KAMIENICA POD GRYFAMI
        //image = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/gryfy.jpg?alt=media&token=54ef1d2a-9102-4eca-8daa-6b3e47e49c1c";
        image = "gryfy.jpg";
        title = "Kamienica pod Gryfami";
        content = "Pierwotnie w tym miejscu stały dwa domy, których pozostałości można znaleźć w piwnicy budynku.";
        description = "Adres: Rynek 2" +
                "\nData budowy: 1300 rok" +
                "\nProjektant: Friedrich Gross" +
                "\nPierwotnie w tym miejscu stały dwa domy, których pozostałości można znaleźć w piwnicy budynku. W 1587-1589 r.  Kamienice przebudowano w stylu manieryzmu niderlandzkiego. Budynek wyróżnia charakterystyczna elewacja  z płaskorzeźbami. Jej szczyt zdobią cztery symetryczne pary  lwów, orłów i  gryfów. Portal budynku wykonany jest z piaskowca. Zdobią go herby  fundatorów: Konrada von Költscha i jego żony.";
        latitude = 51.110208;
        longitude = 17.030392;
        Building building1 = new Building(image, content, title, description, latitude, longitude);
    }

}
