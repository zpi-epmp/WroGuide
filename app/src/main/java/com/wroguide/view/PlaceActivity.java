package com.wroguide.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.wroguide.R;
import com.wroguide.model.Place;
import com.wroguide.model.Route;
import com.wroguide.presenter.ListElementAdapter;
import com.wroguide.presenter.PlacePresenter;

public class PlaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        Place place = (Place) getIntent().getSerializableExtra("place");

        PlacePresenter presenter = new PlacePresenter(place);

        ImageView imageView = findViewById(R.id.place_image);
        Picasso.with(this).load(place.getImage()).into(imageView);

        TextView textView = findViewById(R.id.place_title);
        textView.setText(place.getTitle());

        TextView textView2 = findViewById(R.id.place_description);
        textView2.setText(place.getDescription());
    }
}
