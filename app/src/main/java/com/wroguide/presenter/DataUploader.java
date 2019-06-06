package com.wroguide.presenter;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.wroguide.model.Bridge;
import com.wroguide.model.Building;
import com.wroguide.model.Construction;
import com.wroguide.model.Place;
import com.wroguide.model.Places;
import com.wroguide.model.Route;

import java.util.ArrayList;
import java.util.List;

public class DataUploader {

    public void uploadPlaces(){
       uploadBridgesPl();
       uploadTenementHousesPl();
       uploadGemsPl();
       uploadBridgesEn();
       uploadTenementHousesEn();
       uploadGemsEn();
       uploadBridgesDe();
       uploadTenementHousesDe();
       uploadGemsDe();
    }

    private void uploadRoutePl(Places places, String url, String image, String content, String title, String index){
        Route route = new Route(image, content, title, url);
        route.setPlaces(places);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference();
        reference.child("routes_pl").child(index).setValue(route);
    }

    private void uploadRouteEn(Places places, String url, String image, String content, String title, String index){
        Route route = new Route(image, content, title, url);
        route.setPlaces(places);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference();
        reference.child("routes_en").child(index).setValue(route);
    }

    private void uploadRouteDe(Places places, String url, String image, String content, String title, String index){
        Route route = new Route(image, content, title, url);
        route.setPlaces(places);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference();
        reference.child("routes_de").child(index).setValue(route);
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
        image = "zwierzyniecki.jpg";
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

        List<Place> places = new ArrayList<>();
        places.add(bridge1);
        places.add(bridge2);
        places.add(bridge3);
        places.add(bridge4);
        places.add(bridge5);
        places.add(bridge6);
        places.add(bridge7);

        Places places2 = new Places(places);

        uploadRoutePl(places2, "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/most.JPG?alt=media&token=3d0fe5cc-06f5-4c0a-a908-6bd51971f53f",
                "most.JPG", "Trasa prowadząca przez najbardziej znane mosty wrocławskie - zarówno zabytkowe jak i te o największym znaczeniu komunikacyjnym.","Trasa: Mosty", "1");
    }

    private void uploadTenementHousesPl(){
        String url = "";
        String image = "";
        String title = "";
        String content = "";
        String description = "";
        double latitude = 0;
        double longitude = 0;

        //KAMIENICA POD GRYFAMI PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/gryfy.jpg?alt=media&token=54ef1d2a-9102-4eca-8daa-6b3e47e49c1c";
        image = "gryfy.jpg";
        title = "Kamienica pod Gryfami";
        content = "Pierwotnie w tym miejscu stały dwa domy, których pozostałości można znaleźć w piwnicy budynku.";
        description = "Adres: Rynek 2" +
                "\nData budowy: 1300 rok" +
                "\nProjektant: Friedrich Gross" +
                "\nPierwotnie w tym miejscu stały dwa domy, których pozostałości można znaleźć w piwnicy budynku. W 1587-1589 r.  Kamienice przebudowano w stylu manieryzmu niderlandzkiego. Budynek wyróżnia charakterystyczna elewacja  z płaskorzeźbami. Jej szczyt zdobią cztery symetryczne pary  lwów, orłów i  gryfów. Portal budynku wykonany jest z piaskowca. Zdobią go herby  fundatorów: Konrada von Költscha i jego żony.";
        latitude = 51.110208;
        longitude = 17.030392;
        Building building1 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD ZŁOTYM SŁOŃCEM PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/zlote.jpg?alt=media&token=9c7c2476-e547-443e-b98f-fd974f0671ce";
        image = "zlote.jpg";
        title = "Kamienica pod Złotym Słońcem";
        content = "Kamienica w swoim kształcie powstała w latach 1694-95 w wyniku przebudowy dwóch domów stojacych w tym miejscu.";
        description = "Adres: Rynek 6\n" +
                "Data budowy: XIII wiek\n" +
                "Projektant: Johann Lucas von Hildebrandt\n" +
                "Opis: Kamienica w swoim kształcie powstała w latach 1694-95 w wyniku przebudowy dwóch domów stojacych w tym miejscu. Jest przykładem sztuki barokowej.  Na uwagę zasługuje portal balkonowy i rzeźba przedstawiająca słońce na elewacji. Kamienica była połączona przejściami z Błękitnym Słońcem i Kamienicą Pod Siedmioma Elektorami i  stanowiła rezydencję dla monarchów przebywających we Wrocławiu. Obecnie mieści się tu muzeum Pana Tadeusza.";
        latitude = 51.110208;
        longitude = 17.030392;
        Building building2 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD BŁĘKITNYM SŁOŃCEM PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/blekitne.jpg?alt=media&token=3c914c5f-1248-4ec7-bdec-67e020d5eb12";
        image = "blekitne.jpg";
        title = "Kamienica pod Błękitnym Slońcem";
        content = "Kamienica wielokrotnie przebudowywana,  była połączona przejściami z sąsiednimi budynkami.";
        description = "Adres: Rynek 7\n" +
                "Data budowy: XIV wiek\n" +
                "Projektant: Leo Schlesinger\n" +
                "Opis: Kamienica wielokrotnie przebudowywana,  była połączona przejściami z sąsiednimi budynkami. W 1802 r. fasada kamienicy otrzymała empirowy wystrój. Obecną formę nadano jej w  1901 r. w wyniku gruntownej przebudowy,  budynek podwyższono o jedną kondygnację, wzniesiono nową fasadę z trzema szczytami w stylu secesji, przebudowano wnętrza na potrzeby kamienicy czynszowej i dodano windę. Ostatni remont odbył się w 2013 roku po pożarze dachu.";
        latitude = 51.110208;
        longitude = 17.030392;
        Building building3 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD 7 ELEKTORAMI PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/7elektorow.jpg?alt=media&token=eb978915-7529-4068-9a23-1146bbd06b51";
        image = "7elektorow.jpg";
        title = "Kamienica pod Siedmioma Elektorami";
        content = "Jest jednym z najstarszych budynków w rynku.";
        description = "Adres: Rynek 8\n" +
                "Data budowy: XIII wiek\n" +
                "Projektant: Giacomo Scianzi\n" +
                "Opis: Jest jednym z najstarszych budynków w rynku. Była połączona przejściem z Kamienicą pod Błękitnym Słońcem. Obiekt ulegał licznym przebudowom, na uwagę zasługuje ta z 1672 roku, kiedy nadano jej styl barokowy, a na fasadzie dodano malowidła przedstawiające elektorów Rzeszy i cesarza Leopolda oraz kolumnowy portal z figurą orła z symbolami władzy.";
        latitude = 51.110056;
        longitude = 17.030222;
        Building building4 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD ZŁOTYM DZBANEM PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/zlotyDzban.jpg?alt=media&token=e42c954a-c358-4ac9-a40c-7efcd9672b45";
        image = "zlotyDzban.jpg";
        title = "Kamienica pod Złotym Dzbanem";
        content = "W podwórzu kamienicy mieścił się w średniowieczu browar.";
        description = "Adres: Rynek 22\n" +
                "Data budowy: XIII wiek\n" +
                "Projektant: nieznany, odbudowa:  Zbigniew Malinowski, Marcin Bukowski\n" +
                "Opis: W podwórzu kamienicy mieścił się w średniowieczu browar.  Z browaru  do przedsionka Piwnicy Świdnickiej prowadził  podziemny tunel, wykorzystywany do transportu beczek z piwem, który zachował się do dziś. Kamienica została w dużym stopniu zniszczona w 1945, odbudowano ją w 1955r. zgodnie z wyglądem jaki miała około 1800 roku.";
        latitude = 51.109222;
        longitude = 17.031861;
        Building building5 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD ZIELONĄ DYNIĄ PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/zielonaDynia.jpg?alt=media&token=54d00382-87bc-4f0f-ab5c-dc3e73bf747c";
        image = "zielonaDynia.jpg";
        title = "Kamienica pod Zieloną Dynią";
        content = "Kamienica została przebudowana w 1541 roku w sylu renesansowym.";
        description = "Adres: Rynek 23\n" +
                "Data budowy: XIII wiek\n" +
                "Projektant: nieznany, odbudowa Celina Różycka, Marian Bukowski\n" +
                "Opis: Kamienica została przebudowana w 1541 roku w sylu renesansowym. Na uwagę zasługują trzy osie okienne fasady i szczyt dachu z pilastrami. Poraz  Podczas II Wojny Światowej kamienica została zburzona, odbudowano jaą w latach 1952-1960 w formie  renesansowej. W zrekonstruowanym portalu znajduje się  inskrypcja w języku łacińskim:\"Słowo Pana trwa na wieki\"";
        latitude = 51.109194;
        longitude = 17.031861;
        Building building6 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD ZŁOTYM PSEM PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/zlotyPies.jpg?alt=media&token=03863206-c7c1-402e-afc5-3877847e4b3d";
        image = "zlotyPies.jpg";
        title = "Kamienica pod Złotym Psem";
        content = "Pierwotna kamienica wybudowana była w stylu gotyckim.";
        description = "Adres: Rynek 41\n" +
                "Data budowy: XIII wiek\n" +
                "Projektant: Jan Kalckbrenner\n" +
                "Opis: Pierwotna kamienica wybudowana była w stylu gotyckim. W 1713 została przebudowana w stylu barokowym. Okna ozdobiono puttami i  naczółkami, dodano boniowanie, gzymsy i barokowy szczyt. W 1730 kamienicę wzbogacono o portal z kolumnami i godłem przedstawiajacym złotego psa. Została zniszczona w 1945 roku  i odbudowana od podstaw w roku 1994.";
        latitude = 51.110402;
        longitude = 17.033530;
        Building building7 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICE POD JAŚ I MAŁGOSIA PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/JiM.jpg?alt=media&token=b2b25ca5-4685-4810-977e-f9173f6703ab";
        image = "JiM.jpg";
        title = "Kamienice Jaś i Małgosia";
        content = "Dwie niewielkie kamienice połaczone arkadą, która stanowiła wejście na dawny przykościelny cmentarz.";
        description = "Adres: ul. św. Mikołaja 1\n" +
                "Data budowy: XV wiek\n" +
                "Projektant: nieznany\n" +
                "Opis: Dwie niewielkie kamienice połaczone arkadą, która stanowiła wejście na dawny przykościelny cmentarz.  Mieściły się tu mieszkania duchownych. Kamienica \"Małgosia\" została w 1564 przebudowana. Elewację od południa zwieńczono wysokim manierystycznym szczytem z kamiennymi sterczynami, dodano kamienne obramienia wszystkich okien, kratę w oknie z godłem przedstawiającym skrzyżowane klucze.";
        latitude = 51.111167;
        longitude = 17.030694;
        Building building8 = new Building(image, content, title, description, latitude, longitude, url);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference();
        reference.child("tenements_pl").child("1").setValue(building1);
        reference.child("tenements_pl").child("2").setValue(building2);
        reference.child("tenements_pl").child("3").setValue(building3);
        reference.child("tenements_pl").child("4").setValue(building4);
        reference.child("tenements_pl").child("5").setValue(building5);
        reference.child("tenements_pl").child("6").setValue(building6);
        reference.child("tenements_pl").child("7").setValue(building7);
        reference.child("tenements_pl").child("8").setValue(building8);

        List<Place> places = new ArrayList<>();
        places.add(building1);
        places.add(building2);
        places.add(building3);
        places.add(building4);
        places.add(building5);
        places.add(building6);
        places.add(building7);
        places.add(building8);

        Places places2 = new Places(places);

        uploadRoutePl(places2, "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/kamienica.JPG?alt=media&token=f2f88a97-e956-4070-b84e-c9074d5d2741",
                "kamienica.JPG", "Trasa prowadząca przez najpiękniejsze kamienice miasta Wrocław.","Trasa: Kamienice", "2");
    }

    private void uploadGemsPl(){
        String url = "";
        String image = "";
        String title = "";
        String content = "";
        String description = "";
        double latitude = 0;
        double longitude = 0;

        //HALA STULECIA PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/hala.jpg?alt=media&token=4a911b19-8010-49a7-8f9b-63ae624a5192";
        image = "hala.jpg";
        title = "Hala Stulecia";
        content = "Obiekt widowiskowo-sportowy wybudowany dla upamiętnienia setnej rocznicy odezwy Fryderyka Wilhelma III wzywającej do powszechnego oporu przeciwko Napoleonowi Bonaparte.";
        description = "Data budowy: 1911-1913\n" +
                "Projektant: Max-Berg\n" +
                "Opis: Obiekt widowiskowo-sportowy wybudowany dla upamiętnienia setnej rocznicy odezwy Fryderyka Wilhelma III wzywającej do powszechnego oporu przeciwko Napoleonowi Bonaparte. Jest to najsłynniejszy obiekt modernistyczny we Wrocławiu. W chwili budowy była to konstrukcja wyjątkowa, charakteryzująca się największą rozpiętością kopuły. Dla lepszego wpisania wolnostojącej budowli w otaczającą przestrzeń miejską zaprojektowano większy układ obiektów wystawowych.";
        latitude = 51.106944;
        longitude = 17.076944;
        Construction building1 = new Construction(image, content, title, description, latitude, longitude, url);

        //SEDESOWCE PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/sede3.jpg?alt=media&token=8414a967-dce3-4df2-b183-193cd51befbb";
        image = "sede3.jpg";
        title = "Sedesowce";
        content = "Jest to kompleks 6 budynków mieszkalnych oraz trzech pawilonów handlowych mieszczący się na placu Grunwaldzkim.";
        description = "Data budowy: 1970-1973\n" +
                "Projektant: Jadwiga Grabowska-Hawrylak\n" +
                "Opis: Jest to kompleks 6 budynków mieszkalnych oraz trzech pawilonów handlowych mieszczący się na placu Grunwaldzkim. Przez wrocławian nazywany jest Wrocławskim Manhattanem oraz ze względu na krztałt wnęk okiennych sedesowcami. Projekt zakładał wybudowanie wierzowców pokrytych białym tynkiem z wykończeniami z cegły klinkierowej oraz ciemnym drewnem, a także roślinnością pnącą się we wnękach elewacji.";
        latitude = 51.110258;
        longitude = 17.05397;
        Construction building2 = new Construction(image, content, title, description, latitude, longitude, url);

        //TRZONOLINOWIEC PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/trzono3.jpg?alt=media&token=6ddec7af-d96b-494d-9618-93c8134fee4f";
        image = "trzono3.jpg";
        title = "Trzonolinowiec";
        content = "Jeden z niewielu budynków tego typu w Europie oraz na świecie.";
        description = "Data budowy: 1961 - 1967\n" +
                "Projektant: Andrzej Skorupa i Jacek Burzyński\n" +
                "Opis: Jeden z niewielu budynków tego typu w Europie oraz na świecie. Opiera się na wewnętrznym trzonie przenoszącym pionowe obciążenia ściskające. Stropy to platformy zawieszone na linach.";
        latitude = 51.101389;
        longitude = 17.040278;
        Construction building3 = new Construction(image, content, title, description, latitude, longitude, url);

        //DOM IGLO PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/igloo.jpg?alt=media&token=1c828219-1797-4aef-bc70-426fe17f0410";
        image = "igloo.jpg";
        title = "Dom \"Iglo\"";
        content = "Dom architekta Witolda Lipińskiego zadziwia swoim kształtem oraz nietypowym jak na czasy powstania podejściem do projektowania budynków mieszkalnych.";
        description = "Data budowy: 1962\n" +
                "Projektant: Witold Lipiński\n" +
                "Opis: Dom architekta Witolda Lipińskiego zadziwia swoim kształtem oraz nietypowym jak na czasy powstania podejściem do projektowania budynków mieszkalnych. Ten enegrooszczędny dom powstał w latach 60. Został własnoręcznie wykonany przez sławnego architekta Witolda Lipińskiego.";
        latitude = 51.119069;
        longitude = 17.088445;
        Construction building4 = new Construction(image, content, title, description, latitude, longitude, url);

        //KREDKA I OŁÓWEK PL
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/KiO.jpg?alt=media&token=e358febd-3150-41c7-9102-517157811c57";
        image = "KiO.jpg";
        title = "Kredka i Ołówek";
        content = "Jedne z najbardziej rozpoznawalnych budynków na świecie.";
        description = "Data budowy: 1975-1982\n" +
                "Projektant: Krystyna i Marian Barscy\n" +
                "Opis: Jedne z najbardziej rozpoznawalnych budynków na świecie. Akademki \"Kredka\" i \"Ołówek\" swoje nazwy zawdzięczają wyjątkowej bryle. Stanowią doskonały przykład modernizmu. Zaprojektowane przez sławną rodzinę Barskich specjalistów od architektury uczelnianej.";
        latitude = 51.114426;
        longitude = 17.067633;
        Construction building5 = new Construction(image, content, title, description, latitude, longitude, url);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference();
        reference.child("gems_pl").child("1").setValue(building1);
        reference.child("gems_pl").child("2").setValue(building2);
        reference.child("gems_pl").child("3").setValue(building3);
        reference.child("gems_pl").child("4").setValue(building4);
        reference.child("gems_pl").child("5").setValue(building5);

        List<Place> places = new ArrayList<>();
        places.add(building1);
        places.add(building2);
        places.add(building3);
        places.add(building4);
        places.add(building5);

        Places places2 = new Places(places);

        uploadRoutePl(places2, "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/kamienica.JPG?alt=media&token=f2f88a97-e956-4070-b84e-c9074d5d2741",
                "kamienica.JPG", "Trasa prowadzące przez nietuzinkowe obiekty budowlane Wrocławia.","Trasa: Perełki architektury", "3");
    }

    private void uploadBridgesEn(){
        String url = "";
        String image = "";
        String title = "";
        String content = "";
        String description = "";
        double latitude = 0;
        double longitude = 0;

        //MOST GRUNWALDZKI EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/grun1.jpg?alt=media&token=09b10b9b-2648-481f-8cda-7d8e4f099cf2";
        image = "grun1.jpg";
        title = "Grunwald Bridge";
        content = "The Grunwald Bridge in Wroclaw is a suspension bridge over the Odra River with a steel structure, riveted.";
        description = "Obstacle: Oder\n" +
                "Length: 112.5 m\n" +
                "Number of spans: 1 - hanging\n" +
                "Date of construction: 1908-1910\n" +
                "Designer: Richard Plüddemann (architecture), Alfred von Scholtz and Ernst Günthl (construction), Martin Mayer and Robert Weyrauch (competition project)\n" +
                "Description: The Grunwald Bridge in Wroclaw is a suspension bridge over the Odra River with a steel structure, riveted." +
                " The load-bearing elements are supported on brick pylons made of clinker brick and faced with granite, about 20 m high." +
                " The bridge was built in 1908-1910 as part of the construction of a new route connecting the city center with settlements and institutions of eastern Wrocław." +
                " The bridge was originally called the Tsar bridge (German: Kaiserbrücke). After the end of World War II, he was given the name of the Grunwald bridge.";
        latitude = 51.109497;
        longitude = 17.052549;
        Bridge bridge1 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST POKOJU EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/pokoju.jpg?alt=media&token=f98a7ec3-b5cf-4050-b50a-fe9218d488a8";
        image = "pokoju.jpg";
        title = "Peace Bridge";
        content = "The Peace Bridge was implemented in place of the Lessing bridge destroyed during the Second World War.";
        description = "Obstacle: Odra\n" +
                "Length: 125.3 m\n" +
                "Number of spans: 3\n" +
                "Date of construction: 1954-1959\n" +
                "Designer: Jan Kmita\n" +
                "Description: The Peace Bridge was implemented in place of the Lessing bridge destroyed during the Second World War." +
                " The original bridge was a four-part lattice structure supported on stone pillars." +
                " The new construction was implemented as a three-span object. Each span consists of two cable concrete constructions based on joint supports." +
                " Intermediate supports were realized as concrete pillars. Since 1966, the bridge is called the Peace bridge." +
                " The name was to correspond with the Monument of Return to the Motherland of Western and Northern Territories. Unfortunately, the monument has never been built." +
                " A commemorative plaque remained on the northern outpost, which was supposed to commemorate this monument.";
        latitude = 51.111739;
        longitude = 17.049236;
        Bridge bridge2 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST MILENIJNY EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/mile1.jpg?alt=media&token=fafd3892-f7e1-4d97-b915-b4990cfcae5a";
        image = "mile1.jpg";
        title = "Millennium Bridge";
        content = "The Millennium Bridge is a cable-stayed bridge (suspended) built on the Oder.";
        description = "Obstacle: Odra and Zimowisko Osobowice\n" +
                "Length: 923.5 m\n" +
                "Number of spans: 3\n" +
                "Date of construction: 2002-2004\n" +
                "Designer: Piotr Wanecki\n" +
                "chief designer: Marek Jagiełło\n" +
                "Description: The Millennium Bridge is a cable-stayed bridge (suspended) built on the Oder." +
                " It is from a fragment of the national road No. 5." +
                " The structure is based on two H-shaped pylons." +
                " The length of the proper crossing over the river is 289 m." +
                " The construction of the bridge cost PLN 160 million.";
        latitude = 51.134091;
        longitude = 16.993900;
        Bridge bridge3 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST RĘDZIŃSKI EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/redz2.jpg?alt=media&token=4fea8e60-e150-4949-b461-b130c757aa03";
        image = "redz2.jpg";
        title = "Rędziński Bridge";
        content = "The Rędziński Bridge is a road cable-stayed object built within the Wrocław Ring Road.";
        description = "Obstacle: Oder, Rędzińska Island\n" +
                "Length: 612 m\n" +
                "Number of spans: 4\n" +
                "Date of construction: 2008-2011\n" +
                "Designer: prof. dr hab. Eng. Jan Biliszczuk\n" +
                "Description: The Rędziński Bridge is a road cable-stayed object built within the Wrocław Ring Road." +
                " The construction of the structure is suspended with 160 stays with a total length of 25 km on a single pylon." +
                " The height of the object is 122m. It is the highest cable-stayed facility in Poland.";
        latitude = 51.157573;
        longitude = 16.960763;
        Bridge bridge4 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST ZWIERZYNIECKI EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/zwierzyniecki.jpg?alt=media&token=e157eb30-cedb-4d21-8159-02a58b14025c";
        image = "zwierzyniecki.jpg";
        title = "Zwierzyniecki Bridge";
        content = "This bridge is located in the immediate vicinity of the Zoological Gardens (from which its modern name originates).";
        description = "Obstacle: Old Oder\n" +
                "Length: 62 m\n" +
                "Number of spans: 1\n" +
                "Date of construction: 1895-1897\n" +
                "Designer: Karl Klimm, Richard Plüddemann, A. Fruhwirth\n" +
                "Description: This bridge is located in the immediate vicinity of the Zoological Gardens (from which its modern name originates)." +
                " The crossing in this place has been functioning since 1655. During the plague epidemic, a pass was established on the bridge." +
                " The present facility was built at the end of the 19th century. It is a lattice steel structure based on granite outposts." +
                " The surface structure is suspended from arched trusses using hangers." +
                " The building is decorated with four Art Nouveau objects from red sandstone.";
        latitude = 51.108056;
        longitude = 17.07;
        Bridge bridge5 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST TUMSKI EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/tums2.jpg?alt=media&token=6a515106-0a89-4589-9fa5-0f7a3fac1121";
        image = "tums2.jpg";
        title = "Tumski Bridge";
        content = "Also known as bridge of lovers, a steel riveted bridge connecting Ostrów Tumski with Wyspa Piasek.";
        description = "Obstacle: Oder\n" +
                "Length: 52.19 m\n" +
                "Number of spans: 2\n" +
                "Date of construction: 1889\n" +
                "Designer: Alfred von Scholtz\n" +
                "Description: Also known as bridge of lovers, a steel riveted bridge connecting Ostrów Tumski with Wyspa Piasek. Bridge constructions here have been built since the 12th century. The present facility was built with the active participation of local craftsmen using the river for transporting materials.";
        latitude = 51.114716;
        longitude = 17.042225;
        Bridge bridge6 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST ŚW. KLARY EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/klary.jpg?alt=media&token=a42f0720-baf6-419d-b55c-d5798c9f72f1";
        image = "klary.jpg";
        title = "Saint Clare Bridge";
        content = "The bridge was built over the gutter channels of no longer existing water mills.";
        description = "Obstacle: Clara's vent\n" +
                "Length: 20.6 m\n" +
                "Number of spans: 2\n" +
                "Date of construction: 1992\n" +
                "Description: The bridge was built over the gutter channels of no longer existing water mills. The supporting structure of the bridge is made of steel I-sections. A working platform with barriers is a wooden structure.";
        latitude = 51.116667;
        longitude = 17.039167;
        Bridge bridge7 = new Bridge(image, content, title, description, latitude, longitude, url);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference();
        reference.child("bridges_en").child("1").setValue(bridge1);
        reference.child("bridges_en").child("2").setValue(bridge2);
        reference.child("bridges_en").child("3").setValue(bridge3);
        reference.child("bridges_en").child("4").setValue(bridge4);
        reference.child("bridges_en").child("5").setValue(bridge5);
        reference.child("bridges_en").child("6").setValue(bridge6);
        reference.child("bridges_en").child("7").setValue(bridge7);

        List<Place> places = new ArrayList<>();
        places.add(bridge1);
        places.add(bridge2);
        places.add(bridge3);
        places.add(bridge4);
        places.add(bridge5);
        places.add(bridge6);
        places.add(bridge7);

        Places places2 = new Places(places);

        uploadRouteEn(places2, "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/most.JPG?alt=media&token=3d0fe5cc-06f5-4c0a-a908-6bd51971f53f",
                "most.JPG", "The route leading through the most famous Wrocław bridges - of historical importance, as well as of the greatest communication importance.","Route: Bridges", "1");
    }

    private void uploadTenementHousesEn(){
        String url = "";
        String image = "";
        String title = "";
        String content = "";
        String description = "";
        double latitude = 0;
        double longitude = 0;

        //KAMIENICA POD GRYFAMI EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/gryfy.jpg?alt=media&token=54ef1d2a-9102-4eca-8daa-6b3e47e49c1c";
        image = "gryfy.jpg";
        title = "Tenement house under griffins";
        content = "Originally there were two houses in this place, the remains of which can be found in the basement of the building.";
        description = "Address: Rynek 2\n" +
                "Date of construction: 1300\n" +
                "Designer: Friedrich Gross\n" +
                "Description: Originally there were two houses in this place, the remains of which can be found in the basement of the building. In 1587-1589, the tenement houses were rebuilt in the style of Dutch Mannerism.\n" +
                " The building is distinguished by a characteristic elevation with bas-reliefs. Its top is decorated with four symmetrical pairs of lions, eagles and gryphons. The building's portal is made of sandstone. He is decorated by coats of arms founders: Konrad von Költsch and his wife. ";
        latitude = 51.110208;
        longitude = 17.030392;
        Building building1 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD ZŁOTYM SŁOŃCEM EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/zlote.jpg?alt=media&token=9c7c2476-e547-443e-b98f-fd974f0671ce";
        image = "zlote.jpg";
        title = "Tenement under the Golden Sun";
        content = "A house in its shape was built in 1694-95 as a result of reconstruction of two houses standing in this place.";
        description = "Address: Rynek 6\n" +
                "Date of construction: XIII century\n" +
                "Designer: Johann Lucas von Hildebrandt\n" +
                "Description: A house in its shape was built in 1694-95 as a result of reconstruction of two houses standing in this place. It is an example of baroque art. Noteworthy is the balcony portal and a sculpture depicting the sun on the façade. The tenement house was connected with the Blue Sun and the Tenement House under the Seven Electors, and was a residence for the monarchs living in Wrocław. Currently, there is a museum of Pan Tadeusz here.";
        latitude = 51.110208;
        longitude = 17.030392;
        Building building2 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD BŁĘKITNYM SŁOŃCEM EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/blekitne.jpg?alt=media&token=3c914c5f-1248-4ec7-bdec-67e020d5eb12";
        image = "blekitne.jpg";
        title = "Tenement under the Blue Sun";
        content = "Tenement house reconstructed many times, it was connected with the neighboring buildings.";
        description = "Address: Rynek 7\n" +
                "Date of construction: XIV century\n" +
                "Designer: Leo Schlesinger\n" +
                "Description: Tenement house reconstructed many times, it was connected with the neighboring buildings. In 1802, the facade of the building received an empire design. The current form was given to her in 1901 as a result of a thorough reconstruction, the building was raised by one storey, a new facade was erected with three peaks in the Art Nouveau style, the interiors were rebuilt for the needs of a tenement house and an elevator was added. The last renovation took place in 2013 after a roof fire.";
        latitude = 51.110208;
        longitude = 17.030392;
        Building building3 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD 7 ELEKTORAMI EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/7elektorow.jpg?alt=media&token=eb978915-7529-4068-9a23-1146bbd06b51";
        image = "7elektorow.jpg";
        title = "Tenement under seven electors";
        content = "Is one of the oldest buildings in the market.";
        description = "Address: Rynek 8\n" +
                "Date of construction: XIII century\n" +
                "Designer: Giacomo Scianzi\n" +
                "Description: Is one of the oldest buildings in the market. It was connected by a passage from the Tenement House under the Blue Sun. The building underwent numerous reconstructions, it is noteworthy that the one from 1672, when it was given a Baroque style, and on the façade, paintings depicting the electors of the Reich and Emperor Leopold and a columned portal with a figure of an eagle with symbols of power were added.";
        latitude = 51.110056;
        longitude = 17.030222;
        Building building4 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD ZŁOTYM DZBANEM EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/zlotyDzban.jpg?alt=media&token=e42c954a-c358-4ac9-a40c-7efcd9672b45";
        image = "zlotyDzban.jpg";
        title = "Tenement under the Golden Jug";
        content = "In the courtyard of the tenement house was a brewery in the Middle Ages.";
        description = "Address: Rynek 22\n" +
                "Date of construction: XIII century\n" +
                "Designer: unknown, reconstruction: Zbigniew Malinowski, Marcin Bukowski\n" +
                "Description: In the courtyard of the tenement house was a brewery in the Middle Ages. From the brewery to the vestibule of Piwnica Świdnicka, he ran an underground tunnel, used to transport barrels of beer, which has survived to this day. The tenement house was largely destroyed in 1945, it was rebuilt in 1955. according to the look that it had around 1800.";
        latitude = 51.109222;
        longitude = 17.031861;
        Building building5 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD ZIELONĄ DYNIĄ EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/zielonaDynia.jpg?alt=media&token=54d00382-87bc-4f0f-ab5c-dc3e73bf747c";
        image = "zielonaDynia.jpg";
        title = "Tenement under the Green Pumpkin";
        content = "The house was rebuilt in 1541 in the renaissance style.";
        description = "Address: Rynek 23\n" +
                "Date of construction: XIII century\n" +
                "Designer: unknown, reconstruction by Celina Różycka, Marian Bukowski\n" +
                "Description: The house was rebuilt in 1541 in the renaissance style. Noteworthy are the three window axes of the facade and the top of the roof with pilasters. During the Second World War, the tenement house was demolished and rebuilt in 1952-1960 in the Renaissance form. In the reconstructed portal there is an inscription in Latin: \"The word of the Lord abides for ever\"";
        latitude = 51.109194;
        longitude = 17.031861;
        Building building6 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD ZŁOTYM PSEM EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/zlotyPies.jpg?alt=media&token=03863206-c7c1-402e-afc5-3877847e4b3d";
        image = "zlotyPies.jpg";
        title = "Tenement house at the Golden Dog";
        content = "The original tenement house was built in the Gothic style.";
        description = "Address: Rynek 41\n" +
                "Date of construction: XIII century\n" +
                "Designer: Jan Kalckbrenner\n" +
                "Description: The original tenement house was built in the Gothic style. In 1713 it was rebuilt in the Baroque style. The windows were decorated with putti and pediments, rustication, cornices and a baroque gable were added. In 1730, the tenement was enriched with a portal with columns and a emblem depicting a golden dog. It was destroyed in 1945 and rebuilt from scratch in 1994.";
        latitude = 51.110402;
        longitude = 17.033530;
        Building building7 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICE POD JAŚ I MAŁGOSIA EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/JiM.jpg?alt=media&token=b2b25ca5-4685-4810-977e-f9173f6703ab";
        image = "JiM.jpg";
        title = "Tenements Hansel and Gretel";
        content = "Two small townhouses connected by an arcade, which was the entrance to the former churchyard cemetery.";
        description = "Address: ul. Mikolaja 1\n" +
                "Date of construction: XV century\n" +
                "Designer: unknown\n" +
                "Description: Two small townhouses connected by an arcade, which was the entrance to the former churchyard cemetery. There were clerical apartments here. The \"Małgosia\" house was rebuilt in 1564. The elevation from the south was topped with a high Mannerist gable with stone pinnacles, stone frames of all the windows were added, a lattice in the window with the emblem depicting crossed keys.";
        latitude = 51.111167;
        longitude = 17.030694;
        Building building8 = new Building(image, content, title, description, latitude, longitude, url);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference();
        reference.child("tenements_en").child("1").setValue(building1);
        reference.child("tenements_en").child("2").setValue(building2);
        reference.child("tenements_en").child("3").setValue(building3);
        reference.child("tenements_en").child("4").setValue(building4);
        reference.child("tenements_en").child("5").setValue(building5);
        reference.child("tenements_en").child("6").setValue(building6);
        reference.child("tenements_en").child("7").setValue(building7);
        reference.child("tenements_en").child("8").setValue(building8);

        List<Place> places = new ArrayList<>();
        places.add(building1);
        places.add(building2);
        places.add(building3);
        places.add(building4);
        places.add(building5);
        places.add(building6);
        places.add(building7);
        places.add(building8);

        Places places2 = new Places(places);

        uploadRouteEn(places2, "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/kamienica.JPG?alt=media&token=f2f88a97-e956-4070-b84e-c9074d5d2741",
                "kamienica.JPG", "A route leading through the most beautiful tenement houses in Wrocław.","Route: Tenement Houses", "2");
    }

    private void uploadGemsEn(){
        String url = "";
        String image = "";
        String title = "";
        String content = "";
        String description = "";
        double latitude = 0;
        double longitude = 0;

        //HALA STULECIA EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/hala.jpg?alt=media&token=4a911b19-8010-49a7-8f9b-63ae624a5192";
        image = "hala.jpg";
        title = "Centennial Hall";
        content = "A sports and entertainment building built to commemorate the hundredth anniversary of the proclamation of Frederick William III, calling for universal resistance against Napoleon Bonaparte.";
        description = "Date of construction: 1911-1913\n" +
                "Designer: Max-Berg\n" +
                "Description: A sports and entertainment building built to commemorate the hundredth anniversary of the proclamation of Frederick William III, calling for universal resistance against Napoleon Bonaparte. This is the most famous modernist building in Wroclaw. At the time of construction it was an exceptional construction, characterized by the largest spread of the dome. For a better inclusion of a free-standing building in the surrounding urban space, a larger layout of exhibition facilities was designed.";
        latitude = 51.106944;
        longitude = 17.076944;
        Construction building1 = new Construction(image, content, title, description, latitude, longitude, url);

        //SEDESOWCE EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/sede3.jpg?alt=media&token=8414a967-dce3-4df2-b183-193cd51befbb";
        image = "sede3.jpg";
        title = "\"Toilet houses\"";
        content = "This is a complex of 6 residential buildings and three commercial pavilions located on Grunwaldzki Square.";
        description = "Date of construction: 1970-1973\n" +
                "Designer: Jadwiga Grabowska-Hawrylak\n" +
                "Description: This is a complex of 6 residential buildings and three commercial pavilions located on Grunwaldzki Square. It is called Wroclaw's Manhattan by Wroclawians and because of the septic cavity of the window sills. The project involved the construction of boathouses covered with white plaster with clinker brick finishes and dark wood, as well as vegetation climbing into the elevation recesses.";
        latitude = 51.110258;
        longitude = 17.05397;
        Construction building2 = new Construction(image, content, title, description, latitude, longitude, url);

        //TRZONOLINOWIEC EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/trzono3.jpg?alt=media&token=6ddec7af-d96b-494d-9618-93c8134fee4f";
        image = "trzono3.jpg";
        title = "Line-core building";
        content = "One of the few buildings of this type in Europe and in the world.";
        description = "Date of construction: 1961 - 1967\n" +
                "Designer: Andrzej Skorupa and Jacek Burzyński\n" +
                "Description: One of the few buildings of this type in Europe and in the world. It is based on the internal shaft carrying the vertical compressive loads. The ceilings are platforms suspended on ropes.";
        latitude = 51.101389;
        longitude = 17.040278;
        Construction building3 = new Construction(image, content, title, description, latitude, longitude, url);

        //DOM IGLO EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/igloo.jpg?alt=media&token=1c828219-1797-4aef-bc70-426fe17f0410";
        image = "igloo.jpg";
        title = "\"UFO\" House";
        content = "The house of the architect Witold Lipiński amazes with its shape and unusual approach to the design of residential buildings as for the times of the uprising.";
        description = "Date of construction: 1962\n" +
                "Designer: Witold Lipiński\n" +
                "Description: The house of the architect Witold Lipiński amazes with its shape and unusual approach to the design of residential buildings as for the times of the uprising. This energy-saving house was built in the 1960s. It was hand-made by the famous architect Witold Lipiński.";
        latitude = 51.119069;
        longitude = 17.088445;
        Construction building4 = new Construction(image, content, title, description, latitude, longitude, url);

        //KREDKA I OŁÓWEK EN
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/KiO.jpg?alt=media&token=e358febd-3150-41c7-9102-517157811c57";
        image = "KiO.jpg";
        title = "\"Crayon\" and \"Pencil\"";
        content = "One of the most recognizable buildings in the world.";
        description = "Date of construction: 1975-1982\n" +
                "Designer: Krystyna and Marian Barscy\n" +
                "Description: One of the most recognizable buildings in the world. Academies \"Crayon\" and \"Pencil\" owe their names to a unique shape. They are a perfect example of modernism. Designed by the famous family of Barsky specialists from the university architecture.";
        latitude = 51.114426;
        longitude = 17.067633;
        Construction building5 = new Construction(image, content, title, description, latitude, longitude, url);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference();
        reference.child("gems_en").child("1").setValue(building1);
        reference.child("gems_en").child("2").setValue(building2);
        reference.child("gems_en").child("3").setValue(building3);
        reference.child("gems_en").child("4").setValue(building4);
        reference.child("gems_en").child("5").setValue(building5);

        List<Place> places = new ArrayList<>();
        places.add(building1);
        places.add(building2);
        places.add(building3);
        places.add(building4);
        places.add(building5);

        Places places2 = new Places(places);

        uploadRouteEn(places2, "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/kamienica.JPG?alt=media&token=f2f88a97-e956-4070-b84e-c9074d5d2741",
                "kamienica.JPG", "The route leading through unusual buildings in Wroclaw.","Route: Architectural pearls", "3");
    }

    private void uploadBridgesDe(){
        String url = "";
        String image = "";
        String title = "";
        String content = "";
        String description = "";
        double latitude = 0;
        double longitude = 0;

        //MOST GRUNWALDZKI DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/grun1.jpg?alt=media&token=09b10b9b-2648-481f-8cda-7d8e4f099cf2";
        image = "grun1.jpg";
        title = "Grunwaldbrücke";
        content = "Die Grunwaldbrücke in Breslau ist eine Hängebrücke über die Oder mit einer Stahlkonstruktion, die vernietet ist.";
        description = "Hindernis: Oder\n" +
                "Länge: 112,5 m\n" +
                "Anzahl der Felder: 1 - hängend\n" +
                "Erstellungsdatum: 1908-1910\n" +
                "Designer: Richard Plüddemann (Architektur), Alfred von Scholtz und Ernst Günthl (Konstruktion), Martin Mayer und Robert Weyrauch (Wettbewerbsprojekt)\n" +
                "Beschreibung: Die Grunwaldbrücke in Breslau ist eine Hängebrücke über die Oder mit einer Stahlkonstruktion, die vernietet ist." +
                " Die tragenden Elemente stützen sich auf Ziegelmasten aus Klinker und sind mit ca. 20 m hohem Granit verkleidet." +
                " Die Brücke wurde 1908-1910 im Rahmen des Baus einer neuen Route gebaut, die das Stadtzentrum mit den Siedlungen und Einrichtungen des östlichen Breslau verbindet." +
                " Die Brücke hieß ursprünglich Kaiserbrücke. Nach dem Ende des Zweiten Weltkriegs erhielt er den Namen der Grunwaldbrücke.";
        latitude = 51.109497;
        longitude = 17.052549;
        Bridge bridge1 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST POKOJU DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/pokoju.jpg?alt=media&token=f98a7ec3-b5cf-4050-b50a-fe9218d488a8";
        image = "pokoju.jpg";
        title = "Friedensbrücke";
        content = "Die Friedensbrücke wurde anstelle der im Zweiten Weltkrieg zerstörten Lessingbrücke errichtet.";
        description = "Hindernis: Oder\n" +
                "Länge: 125,3 m\n" +
                "Anzahl der Felder: 3\n" +
                "Erstellungsdatum: 1954-1959\n" +
                "Designer: Jan Kmita\n" +
                "Beschreibung: Die Friedensbrücke wurde anstelle der im Zweiten Weltkrieg zerstörten Lessingbrücke errichtet." +
                " Die ursprüngliche Brücke war eine vierteilige Gitterstruktur, die auf Steinsäulen getragen wurde." +
                " Der Neubau wurde als dreistufiges Objekt realisiert. Jede Spannweite besteht aus zwei Kabelbetonkonstruktionen, die auf Verbindungsstützen basieren." +
                " Zwischenstützen wurden als Betonpfeiler realisiert. Seit 1966 heißt die Brücke Friedensbrücke." +
                " Der Name sollte mit dem Denkmal der Rückkehr ins Mutterland der West- und Nordterritorien übereinstimmen. Leider wurde das Denkmal nie gebaut." +
                " Am nördlichen Außenposten befand sich noch eine Gedenktafel, die an dieses Denkmal erinnern sollte.";
        latitude = 51.111739;
        longitude = 17.049236;
        Bridge bridge2 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST MILENIJNY DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/mile1.jpg?alt=media&token=fafd3892-f7e1-4d97-b915-b4990cfcae5a";
        image = "mile1.jpg";
        title = "Millennium-Brücke";
        content = "Die Millennium-Brücke ist eine Schrägseilbrücke an der Oder.";
        description = "Hindernis: Oder und Zimowisko Osobowice\n" +
                "Länge: 923,5 m\n" +
                "Anzahl der Felder: 3\n" +
                "Erstellungsdatum: 2002-2004\n" +
                "Designer: Piotr Wanecki\n" +
                "Chefdesigner: Marek Jagiełło\n" +
                "Beschreibung: Die Millennium-Brücke ist eine Schrägseilbrücke an der Oder." +
                " Es ist aus einem Fragment der Nationalstraße Nr. 5." +
                " Die Struktur basiert auf zwei H-förmigen Pylonen." +
                " Die Länge der eigentlichen Überquerung des Flusses beträgt 289 m." +
                " Der Bau der Brücke kostete 160 Mio. PLN.";
        latitude = 51.134091;
        longitude = 16.993900;
        Bridge bridge3 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST RĘDZIŃSKI DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/redz2.jpg?alt=media&token=4fea8e60-e150-4949-b461-b130c757aa03";
        image = "redz2.jpg";
        title = "Rędziński-Brücke";
        content = "Die Rędziński-Brücke ist eine Schrägseilbrücke auf der Wrocław Ring Road.";
        description = "Hindernis: Oder, Insel Rędzińska\n" +
                "Länge: 612 m\n" +
                "Anzahl der Felder: 4\n" +
                "Erstellungsdatum: 2008-2011\n" +
                "Designer: prof. dr hab. Eng. Jan Biliszczuk\n" +
                "Beschreibung: Die Rędziński-Brücke ist eine Schrägseilbrücke auf der Wrocław Ring Road." +
                " Die Konstruktion des Bauwerks ist mit 160 Streben mit einer Gesamtlänge von 25 km auf einem einzigen Pylon aufgehängt." +
                " Die Höhe des Objektes beträgt 122m. Es ist die höchste Schrägseilanlage in Polen.";
        latitude = 51.157573;
        longitude = 16.960763;
        Bridge bridge4 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST ZWIERZYNIECKI DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/zwierzyniecki.jpg?alt=media&token=e157eb30-cedb-4d21-8159-02a58b14025c";
        image = "zwierzyniecki.jpg";
        title = "Tiergartenbrücke";
        content = "Diese Brücke befindet sich in unmittelbarer Nähe des Zoologischen Gartens (von dem der heutige Name stammt).";
        description = "Hindernis: Alte Oder\n" +
                "Länge: 62 m\n" +
                "Anzahl der Felder: 1\n" +
                "Erstellungsdatum: 1895-1897\n" +
                "Designer: Karl Klimm, Richard Plüddemann, A. Frühwirth\n" +
                "Beschreibung: Diese Brücke befindet sich in unmittelbarer Nähe des Zoologischen Gartens (von dem der heutige Name stammt)." +
                " Der Übergang an dieser Stelle funktioniert seit 1655. Während der Pestepidemie wurde ein Pass auf der Brücke eingerichtet." +
                " Die heutige Anlage wurde Ende des 19. Jahrhunderts erbaut und ist eine Stahlgitterkonstruktion auf der Basis von Granitaußenposten." +
                " Die Oberflächenstruktur wird mit Bügeln an gewölbten Fachwerken aufgehängt." +
                " Das Gebäude ist mit vier Jugendstilobjekten aus rotem Sandstein geschmückt.";
        latitude = 51.108056;
        longitude = 17.07;
        Bridge bridge5 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST TUMSKI DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/tums2.jpg?alt=media&token=6a515106-0a89-4589-9fa5-0f7a3fac1121";
        image = "tums2.jpg";
        title = "Dombrücke";
        content = "Auch Liebesbrücke genannt, eine Stahlnietbrücke, die Ostrów Tumski mit Wyspa Piasek verbindet.";
        description = "Hindernis: Masern\n" +
                "Länge: 52,19 m\n" +
                "Anzahl der Felder: 2\n" +
                "Erstellungsdatum: 1889\n" +
                "Designer: Alfred von Scholtz\n" +
                "Beschreibung: Auch Liebesbrücke genannt, eine Stahlnietbrücke, die Ostrów Tumski mit Wyspa Piasek verbindet. Hier wurden seit dem 12. Jahrhundert Brückenkonstruktionen errichtet. Die heutige Anlage wurde unter aktiver Beteiligung lokaler Handwerker errichtet, die den Fluss für den Materialtransport nutzen.";
        latitude = 51.114716;
        longitude = 17.042225;
        Bridge bridge6 = new Bridge(image, content, title, description, latitude, longitude, url);

        //MOST ŚW. KLARY DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/klary.jpg?alt=media&token=a42f0720-baf6-419d-b55c-d5798c9f72f1";
        image = "klary.jpg";
        title = "Clarasbrücke";
        content = "Die Brücke wurde über die Rinnenkanäle nicht mehr vorhandener Wassermühlen gebaut.";
        description = "Hindernis: Claras Entlüftung\n" +
                "Länge: 20,6 m\n" +
                "Anzahl der Felder: 2\n" +
                "Erstellungsdatum: 1992\n" +
                "Designer:\n" +
                "Beschreibung: Die Brücke wurde über die Rinnenkanäle nicht mehr vorhandener Wassermühlen gebaut. Die Tragkonstruktion der Brücke besteht aus Stahl-I-Profilen. Eine Arbeitsplattform mit Barrieren ist eine Holzkonstruktion.";
        latitude = 51.116667;
        longitude = 17.039167;
        Bridge bridge7 = new Bridge(image, content, title, description, latitude, longitude, url);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference();
        reference.child("bridges_de").child("1").setValue(bridge1);
        reference.child("bridges_de").child("2").setValue(bridge2);
        reference.child("bridges_de").child("3").setValue(bridge3);
        reference.child("bridges_de").child("4").setValue(bridge4);
        reference.child("bridges_de").child("5").setValue(bridge5);
        reference.child("bridges_de").child("6").setValue(bridge6);
        reference.child("bridges_de").child("7").setValue(bridge7);

        List<Place> places = new ArrayList<>();
        places.add(bridge1);
        places.add(bridge2);
        places.add(bridge3);
        places.add(bridge4);
        places.add(bridge5);
        places.add(bridge6);
        places.add(bridge7);

        Places places2 = new Places(places);

        uploadRouteDe(places2, "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/most.JPG?alt=media&token=3d0fe5cc-06f5-4c0a-a908-6bd51971f53f",
                "most.JPG", "Die Route führt durch die berühmtesten Breslauer Brücken - von historischer Bedeutung sowie von größter Kommunikationsbedeutung.","Route: Brücken", "1");
    }

    private void uploadTenementHousesDe(){
        String url = "";
        String image = "";
        String title = "";
        String content = "";
        String description = "";
        double latitude = 0;
        double longitude = 0;

        //KAMIENICA POD GRYFAMI DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/gryfy.jpg?alt=media&token=54ef1d2a-9102-4eca-8daa-6b3e47e49c1c";
        image = "gryfy.jpg";
        title = "Mietshaus unter Greifen";
        content = "Ursprünglich befanden sich an dieser Stelle zwei Häuser, deren Überreste sich im Keller des Gebäudes befinden.";
        description = "Adresse: Rynek 2\n" +
                "Erstellungsdatum: 1300 \n" +
                "Designer: Friedrich Gross\n" +
                "Beschreibung: Ursprünglich befanden sich an dieser Stelle zwei Häuser, deren Überreste sich im Keller des Gebäudes befinden. In den Jahren 1587-1589 wurden die Mietshäuser im Stil des niederländischen Manierismus umgebaut." +
                " Das Gebäude zeichnet sich durch eine charakteristische Erhebung mit Reliefs aus. Die Spitze ist mit vier symmetrischen Löwen-, Adler- und Greifenpaaren verziert. Das Portal des Gebäudes besteht aus Sandstein. Er ist mit Wappenstiftern geschmückt: Konrad von Költsch und seine Frau.";
        latitude = 51.110208;
        longitude = 17.030392;
        Building building1 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD ZŁOTYM SŁOŃCEM DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/zlote.jpg?alt=media&token=9c7c2476-e547-443e-b98f-fd974f0671ce";
        image = "zlote.jpg";
        title = "Mietshaus unter der goldenen Sonne";
        content = "Ein Haus in seiner Form wurde 1694-95 als Ergebnis der Rekonstruktion von zwei an dieser Stelle stehenden Häusern erbaut.";
        description = "Adresse: Rynek 6\n" +
                "Erstellungsdatum: XIII Jahrhundert\n" +
                "Designer: Johann Lucas von Hildebrandt\n" +
                "Beschreibung: Ein Haus in seiner Form wurde 1694-95 als Ergebnis der Rekonstruktion von zwei an dieser Stelle stehenden Häusern erbaut. Es ist ein Beispiel für Barockkunst. Bemerkenswert ist das Balkonportal und eine Skulptur, die die Sonne auf der Fassade darstellt. Das Mietshaus war mit der Blauen Sonne und dem Mietshaus unter den sieben Kurfürsten verbunden und war eine Residenz für die in Breslau lebenden Monarchen. Derzeit gibt es hier ein Museum von Pan Tadeusz.";
        latitude = 51.110208;
        longitude = 17.030392;
        Building building2 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD BŁĘKITNYM SŁOŃCEM DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/blekitne.jpg?alt=media&token=3c914c5f-1248-4ec7-bdec-67e020d5eb12";
        image = "blekitne.jpg";
        title = "Mietshaus unter der blauen Sonne";
        content = "Mehrfach umgebautes Mietshaus, das mit den Nachbargebäuden verbunden war.";
        description = "Adresse: Rynek 7\n" +
                "Erstellungsdatum: XIV. Jahrhundert\n" +
                "Designer: Leo Schlesinger\n" +
                "Beschreibung: Mehrfach umgebautes Mietshaus, das mit den Nachbargebäuden verbunden war. 1802 erhielt die Fassade des Gebäudes einen Empire-Entwurf. Die jetzige Form erhielt sie 1901 nach einer gründlichen Rekonstruktion, das Gebäude wurde um ein Stockwerk erhöht, eine neue Fassade mit drei Zinnen im Jugendstil errichtet, die Innenräume für die Bedürfnisse eines Mietshauses umgebaut und ein Aufzug hinzugefügt. Die letzte Renovierung fand 2013 nach einem Dachbrand statt.";
        latitude = 51.110208;
        longitude = 17.030392;
        Building building3 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD 7 ELEKTORAMI DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/7elektorow.jpg?alt=media&token=eb978915-7529-4068-9a23-1146bbd06b51";
        image = "7elektorow.jpg";
        title = "Mietshaus unter sieben Wählern";
        content = "Ist eines der ältesten Gebäude auf dem Markt.";
        description = "Adresse: Rynek 8\n" +
                "Erstellungsdatum: XIII Jahrhundert\n" +
                "Designer: Giacomo Scianzi\n" +
                "Beschreibung: Ist eines der ältesten Gebäude auf dem Markt. Es war durch eine Passage aus dem Mietshaus unter der blauen Sonne verbunden. Das Gebäude wurde mehrfach umgebaut. Bemerkenswert ist, dass das Gebäude aus dem Jahr 1672 im Barockstil erbaut wurde und an der Fassade Gemälde der Kurfürsten und des Kaisers Leopold sowie ein Säulenportal mit einer Adlerfigur mit Symbolen der Macht angebracht wurden.";
        latitude = 51.110056;
        longitude = 17.030222;
        Building building4 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD ZŁOTYM DZBANEM DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/zlotyDzban.jpg?alt=media&token=e42c954a-c358-4ac9-a40c-7efcd9672b45";
        image = "zlotyDzban.jpg";
        title = "Mietshaus unter dem goldenen Krug";
        content = "Im Hof des Mietshauses befand sich im Mittelalter eine Brauerei.";
        description = "Adresse: Rynek 22\n" +
                "Erstellungsdatum: XIII Jahrhundert\n" +
                "Designer: unbekannt, Rekonstruktion: Zbigniew Malinowski, Marcin Bukowski\n" +
                "Beschreibung: Im Hof des Mietshauses befand sich im Mittelalter eine Brauerei. Von der Brauerei bis zum Vestibül von Piwnica Świdnicka betrieb er einen unterirdischen Tunnel für den Transport von Bierfässern, der bis heute erhalten ist. Das Mietshaus wurde 1945 weitgehend zerstört, 1955 wieder aufgebaut. nach dem blick, den es um 1800 hatte.";
        latitude = 51.109222;
        longitude = 17.031861;
        Building building5 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD ZIELONĄ DYNIĄ DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/zielonaDynia.jpg?alt=media&token=54d00382-87bc-4f0f-ab5c-dc3e73bf747c";
        image = "zielonaDynia.jpg";
        title = "Mietshaus unter dem grünen Kürbis";
        content = "Das Haus wurde 1541 im Renaissancestil umgebaut.";
        description = "Adresse: Rynek 23\n" +
                "Erstellungsdatum: XIII Jahrhundert\n" +
                "Designer: unbekannt, Rekonstruktion von Celina Różycka, Marian Bukowski\n" +
                "Beschreibung: Das Haus wurde 1541 im Renaissancestil umgebaut. Bemerkenswert sind die drei Fensterachsen der Fassade und die Dachspitze mit Pilastern. Während des Zweiten Weltkriegs wurde das Mietshaus abgerissen und in den Jahren 1952-1960 in der Renaissanceform wieder aufgebaut. Auf dem rekonstruierten Portal steht eine lateinische Inschrift: \"Das Wort des Herrn bleibt für immer\"";
        latitude = 51.109194;
        longitude = 17.031861;
        Building building6 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICA POD ZŁOTYM PSEM DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/zlotyPies.jpg?alt=media&token=03863206-c7c1-402e-afc5-3877847e4b3d";
        image = "zlotyPies.jpg";
        title = "Mietshaus am Goldenen Hund";
        content = "Das ursprüngliche Mietshaus wurde im gotischen Stil erbaut.";
        description = "Adresse: Rynek 41\n" +
                "Erstellungsdatum: XIII Jahrhundert\n" +
                "Designer: Jan Kalckbrenner\n" +
                "Beschreibung: Das ursprüngliche Mietshaus wurde im gotischen Stil erbaut. 1713 wurde es im Barockstil umgebaut. Die Fenster wurden mit Putten und Giebeln verziert, Rustikationen, Gesimse und ein Barockgiebel wurden hinzugefügt. Im Jahr 1730 wurde das Mietshaus mit einem Portal mit Säulen und einem Emblem mit einem goldenen Hund angereichert. Es wurde 1945 zerstört und 1994 von Grund auf neu aufgebaut.";
        latitude = 51.110402;
        longitude = 17.033530;
        Building building7 = new Building(image, content, title, description, latitude, longitude, url);

        //KAMIENICE POD JAŚ I MAŁGOSIA DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/JiM.jpg?alt=media&token=b2b25ca5-4685-4810-977e-f9173f6703ab";
        image = "JiM.jpg";
        title = "Mietshänsel und Gretel";
        content = "Zwei kleine Stadthäuser, die durch eine Arkade miteinander verbunden sind.";
        description = "Adresse: ul. Mikolaja 1\n" +
                "Erstellungsdatum: XV Jahrhundert\n" +
                "Designer: unbekannt\n" +
                "Beschreibung: Zwei kleine Stadthäuser, die durch eine Arkade miteinander verbunden sind. Dies war der Eingang zum ehemaligen Friedhof auf dem Kirchhof. Hier gab es kirchliche Wohnungen. Das Haus \"Małgosia\" wurde 1564 umgebaut. Die Erhebung von Süden wurde mit einem hohen manieristischen Giebel mit Steinkuppeln gekrönt, Steinrahmen aller Fenster wurden hinzugefügt, ein Gitter im Fenster mit dem Emblem, das gekreuzte Schlüssel darstellt.";
        latitude = 51.111167;
        longitude = 17.030694;
        Building building8 = new Building(image, content, title, description, latitude, longitude, url);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference();
        reference.child("tenements_de").child("1").setValue(building1);
        reference.child("tenements_de").child("2").setValue(building2);
        reference.child("tenements_de").child("3").setValue(building3);
        reference.child("tenements_de").child("4").setValue(building4);
        reference.child("tenements_de").child("5").setValue(building5);
        reference.child("tenements_de").child("6").setValue(building6);
        reference.child("tenements_de").child("7").setValue(building7);
        reference.child("tenements_de").child("8").setValue(building8);

        List<Place> places = new ArrayList<>();
        places.add(building1);
        places.add(building2);
        places.add(building3);
        places.add(building4);
        places.add(building5);
        places.add(building6);
        places.add(building7);
        places.add(building8);

        Places places2 = new Places(places);

        uploadRouteDe(places2, "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/kamienica.JPG?alt=media&token=f2f88a97-e956-4070-b84e-c9074d5d2741",
                "kamienica.JPG", "Eine Route, die durch die schönsten Wohnhäuser in Breslau führt.","Route: Wohnhäuser", "2");
    }

    private void uploadGemsDe(){
        String url = "";
        String image = "";
        String title = "";
        String content = "";
        String description = "";
        double latitude = 0;
        double longitude = 0;

        //HALA STULECIA DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/hala.jpg?alt=media&token=4a911b19-8010-49a7-8f9b-63ae624a5192";
        image = "hala.jpg";
        title = "Jahrhunderthalle";
        content = "Ein Sport- und Unterhaltungsgebäude, das anlässlich des 100. Jahrestages der Verkündigung Friedrich Wilhelms III. Erbaut wurde und zum allgemeinen Widerstand gegen Napoleon Bonaparte aufrief.";
        description = "Erstellungsdatum: 1911-1913\n" +
                "Designer: Max-Berg\n" +
                "Beschreibung: Ein Sport- und Unterhaltungsgebäude, das anlässlich des 100. Jahrestages der Verkündigung Friedrich Wilhelms III. Erbaut wurde und zum allgemeinen Widerstand gegen Napoleon Bonaparte aufrief. Dies ist das berühmteste modernistische Gebäude in Breslau. Zum Zeitpunkt des Baus war es eine außergewöhnliche Konstruktion, die durch die größte Ausdehnung der Kuppel gekennzeichnet war. Zur besseren Einbindung eines freistehenden Gebäudes in den umliegenden Stadtraum wurde ein größerer Ausstellungsraum konzipiert.";
        latitude = 51.106944;
        longitude = 17.076944;
        Construction building1 = new Construction(image, content, title, description, latitude, longitude, url);

        //SEDESOWCE DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/sede3.jpg?alt=media&token=8414a967-dce3-4df2-b183-193cd51befbb";
        image = "sede3.jpg";
        title = "Toilettenhäuser";
        content = "Dies ist ein Komplex aus 6 Wohngebäuden und drei Geschäftspavillons am Grunwaldzki-Platz.";
        description = "Erstellungsdatum: 1970-1973\n" +
                "Designer: Jadwiga Grabowska-Hawrylak\n" +
                "Beschreibung: Dies ist ein Komplex aus 6 Wohngebäuden und drei Geschäftspavillons am Grunwaldzki-Platz. Es wird von den Breslauern Wroclaws Wroclaw genannt und wegen der Klärgrube der Fensterbänke. Das Projekt umfasste den Bau von mit weißem Putz mit Klinkeroberflächen und dunklem Holz überzogenen Bootshäusern sowie das Klettern von Pflanzen in die Erhebungsvertiefungen.";
        latitude = 51.110258;
        longitude = 17.05397;
        Construction building2 = new Construction(image, content, title, description, latitude, longitude, url);

        //TRZONOLINOWIEC DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/trzono3.jpg?alt=media&token=6ddec7af-d96b-494d-9618-93c8134fee4f";
        image = "trzono3.jpg";
        title = "Line-Core-Gebäude";
        content = "Eines der wenigen Gebäude dieser Art in Europa und der Welt.";
        description = "Erstellungsdatum: 1961 - 1967\n" +
                "Designer: Andrzej Skorupa und Jacek Burzyński\n" +
                "Beschreibung: Eines der wenigen Gebäude dieser Art in Europa und der Welt. Es basiert auf der inneren Welle, die die vertikalen Drucklasten trägt. Die Decken sind Plattformen, die an Seilen aufgehängt sind.";
        latitude = 51.101389;
        longitude = 17.040278;
        Construction building3 = new Construction(image, content, title, description, latitude, longitude, url);

        //DOM IGLO DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/igloo.jpg?alt=media&token=1c828219-1797-4aef-bc70-426fe17f0410";
        image = "igloo.jpg";
        title = "UFO Haus";
        content = "Das Haus des Architekten Witold Lipiński besticht durch seine Form und ungewöhnliche Herangehensweise an die Gestaltung von Wohngebäuden wie zu Zeiten des Aufstands.";
        description = "Erstellungsdatum: 1962\n" +
                "Designer: Witold Lipiński\n" +
                "Beschreibung: Das Haus des Architekten Witold Lipiński besticht durch seine Form und ungewöhnliche Herangehensweise an die Gestaltung von Wohngebäuden wie zu Zeiten des Aufstands. Dieses energiesparende Haus wurde in den 1960er Jahren gebaut und vom berühmten Architekten Witold Lipiński handgefertigt.";
        latitude = 51.119069;
        longitude = 17.088445;
        Construction building4 = new Construction(image, content, title, description, latitude, longitude, url);

        //KREDKA I OŁÓWEK DE
        url = "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/KiO.jpg?alt=media&token=e358febd-3150-41c7-9102-517157811c57";
        image = "KiO.jpg";
        title = "Wachsmalstift und Bleistift";
        content = "Eines der bekanntesten Gebäude der Welt.";
        description = "Erstellungsdatum: 1975-1982\n" +
                "Designer: Krystyna und Marian Barscy\n" +
                "Beschreibung: Eines der bekanntesten Gebäude der Welt. Die Akademien \" Wachsmalstift\" und \"Bleistift\" verdanken ihren Namen einer einzigartigen Form. Sie sind ein perfektes Beispiel für die Moderne. Entworfen von der berühmten Familie der Barsky-Spezialisten aus der Hochschularchitektur.";
        latitude = 51.114426;
        longitude = 17.067633;
        Construction building5 = new Construction(image, content, title, description, latitude, longitude, url);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference();
        reference.child("gems_de").child("1").setValue(building1);
        reference.child("gems_de").child("2").setValue(building2);
        reference.child("gems_de").child("3").setValue(building3);
        reference.child("gems_de").child("4").setValue(building4);
        reference.child("gems_de").child("5").setValue(building5);

        List<Place> places = new ArrayList<>();
        places.add(building1);
        places.add(building2);
        places.add(building3);
        places.add(building4);
        places.add(building5);

        Places places2 = new Places(places);

        uploadRouteDe(places2, "https://firebasestorage.googleapis.com/v0/b/wroguide-b3379.appspot.com/o/kamienica.JPG?alt=media&token=f2f88a97-e956-4070-b84e-c9074d5d2741",
                "kamienica.JPG", "Die Route führt durch ungewöhnliche Gebäude in Breslau.","Route: Architekturperlen", "3");
    }

}
