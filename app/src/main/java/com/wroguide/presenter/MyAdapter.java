package com.wroguide.presenter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;
import com.wroguide.R;
import com.wroguide.view.RouteElement;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter  {

    // źródło danych
    private ArrayList<RouteElement> routes = new ArrayList<>();

    // obiekt listy artykułów
    private RecyclerView mRecyclerView;



    // implementacja wzorca ViewHolder
    // każdy obiekt tej klasy przechowuje odniesienie do layoutu elementu listy
    // dzięki temu wywołujemy findViewById() tylko raz dla każdego elementu
    private class MyViewHolder extends RecyclerView.ViewHolder  {
        public TextView routeTitle;
        public TextView routeContent;
        public ImageView routeImage;



        public MyViewHolder(View pItem) {
            super(pItem);

            routeTitle = (TextView) pItem.findViewById(R.id.route_title);
            routeContent = (TextView) pItem.findViewById(R.id.route_content);
            routeImage = (ImageView) pItem.findViewById(R.id.route_image);
        }



        }


    // konstruktor adaptera
    public MyAdapter(ArrayList<RouteElement> pRoutes, RecyclerView pRecyclerView) {
        routes = pRoutes;
        mRecyclerView = pRecyclerView;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
        // tworzymy layout artykułu oraz obiekt ViewHoldera
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.routes_element, viewGroup, false);
        MyViewHolder Vh = new MyViewHolder(view);


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // odnajdujemy indeks klikniętego elementu
                int position = mRecyclerView.getChildAdapterPosition(v);




            }
        });






        // tworzymy i zwracamy obiekt ViewHolder
        //return new MyViewHolder(view);
        return Vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        // uzupełniamy layout
        RouteElement element = (RouteElement) routes.get(i);
        ((MyViewHolder) viewHolder).routeTitle.setText(element.getTitle());
        ((MyViewHolder) viewHolder).routeContent.setText(element.getContent());

        // Picasso.with(((MyViewHolder) viewHolder).routeImage.getContext()).load(element.getPicture()).
        //  resize(100, 100).centerCrop().into(((MyViewHolder) viewHolder).routeImage);
//        ((MyViewHolder) viewHolder).routeImage.setImageResource(element.getPicture());

        Picasso.with(((MyViewHolder) viewHolder).routeImage.getContext())
                .load(element.getPicture())
                .fit()
                .centerCrop()
                .error(R.drawable.ic_error_white)
                .into(((MyViewHolder) viewHolder).routeImage);

    }

    @Override
    public int getItemCount() {
        return routes.size();
    }


}