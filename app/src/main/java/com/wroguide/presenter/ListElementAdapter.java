package com.wroguide.presenter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.wroguide.R;
import com.wroguide.model.ListElement;
import com.wroguide.model.Place;
import com.wroguide.model.Route;
import com.wroguide.view.PlaceActivity;
import com.wroguide.view.RouteActivity;

import java.util.List;

public class ListElementAdapter <T extends ListElement> extends RecyclerView.Adapter {

    private List<T> elements;
    private RecyclerView recyclerView;

    private class ListElementViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public TextView content;
        public TextView title;

        public ListElementViewHolder(View item) {
            super(item);
            image = item.findViewById(R.id.list_element_image);
            content = item.findViewById(R.id.list_element_content);
            title = item.findViewById(R.id.list_element_title);
        }

    }

    public ListElementAdapter(List<T> elements, RecyclerView recyclerView) {
        this.elements = elements;
        this.recyclerView = recyclerView;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_element_layout, viewGroup, false);


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!elements.isEmpty()) {
                    Context context = v.getContext();
                    Intent intent = null; //ustawić aktywność do wystarowania jeśli lista jest pusta
                    if (elements.get(0) instanceof Place) {
                        intent = new Intent(context, PlaceActivity.class);
                    }
                    if (elements.get(0) instanceof Route) {
                        intent = new Intent(context, RouteActivity.class);
                        int position = recyclerView.getChildLayoutPosition(v);
                        Route route = (Route) elements.get(position);
                        intent.putExtra("route" ,route);
                    }
                    context.startActivity(intent);
                }
            }
        });

        return new ListElementViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        ListElement element = elements.get(i);
        int source = 0; //tu ustawić odniesienie do obrazka, który pojawia się w liście,
                        // gdy brak obrazka innego
        try {
            source = Integer.parseInt(element.getImage());
        }
        catch(NumberFormatException e) {
            e.printStackTrace();
        }
        Picasso.with(((ListElementViewHolder) viewHolder).image.getContext()).
                load(source).into(((ListElementViewHolder) viewHolder).image);
        ((ListElementViewHolder) viewHolder).content.setText(element.getContent());
        ((ListElementViewHolder) viewHolder).title.setText(element.getTitle());
    }

    @Override
    public int getItemCount() {
        return elements.size();
    }
}
