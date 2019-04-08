package com.wroguide.view.atrakcje;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wroguide.R;

import java.util.ArrayList;

    public class ObjectsActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.object_activity);

            RecyclerView recyclerView = findViewById(R.id.list_elements);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            ArrayList<ListElement> bridges = new ArrayList<>();
            bridges.add(new Bridge(Uri.parse("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Most_Pi%C5%82sudskiego_w_Krakowie.jpg/1200px-Most_Pi%C5%82sudskiego_w_Krakowie.jpg"), "opis"));
            bridges.add(new Bridge(Uri.parse("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Most_Pi%C5%82sudskiego_w_Krakowie.jpg/1200px-Most_Pi%C5%82sudskiego_w_Krakowie.jpg"), "opis"));
            bridges.add(new Bridge(Uri.parse("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Most_Pi%C5%82sudskiego_w_Krakowie.jpg/1200px-Most_Pi%C5%82sudskiego_w_Krakowie.jpg"), "opis"));
            bridges.add(new Bridge(Uri.parse("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Most_Pi%C5%82sudskiego_w_Krakowie.jpg/1200px-Most_Pi%C5%82sudskiego_w_Krakowie.jpg"), "opis"));
            bridges.add(new Bridge(Uri.parse("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Most_Pi%C5%82sudskiego_w_Krakowie.jpg/1200px-Most_Pi%C5%82sudskiego_w_Krakowie.jpg"), "opis"));
            bridges.add(new Bridge(Uri.parse("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Most_Pi%C5%82sudskiego_w_Krakowie.jpg/1200px-Most_Pi%C5%82sudskiego_w_Krakowie.jpg"), "opis"));
            bridges.add(new Bridge(Uri.parse("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Most_Pi%C5%82sudskiego_w_Krakowie.jpg/1200px-Most_Pi%C5%82sudskiego_w_Krakowie.jpg"), "opis"));
            bridges.add(new Bridge(Uri.parse("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Most_Pi%C5%82sudskiego_w_Krakowie.jpg/1200px-Most_Pi%C5%82sudskiego_w_Krakowie.jpg"), "opis"));
            bridges.add(new Bridge(Uri.parse("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Most_Pi%C5%82sudskiego_w_Krakowie.jpg/1200px-Most_Pi%C5%82sudskiego_w_Krakowie.jpg"), "opis"));
            bridges.add(new Bridge(Uri.parse("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Most_Pi%C5%82sudskiego_w_Krakowie.jpg/1200px-Most_Pi%C5%82sudskiego_w_Krakowie.jpg"), "opis"));
            recyclerView.setAdapter(new ListElementAdapter(bridges, recyclerView));
        }

    }

