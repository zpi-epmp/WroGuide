package com.wroguide.view.lista;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.wroguide.R;

import java.util.ArrayList;

public class ListElementAdapter extends RecyclerView.Adapter {

    private ArrayList<ListElement> elements;
    private RecyclerView recyclerView;

    private class ListElementViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public TextView description;

        public ListElementViewHolder(View item) {
            super(item);
            image = item.findViewById(R.id.list_element_image);
            description = item.findViewById(R.id.list_element_description);
        }

    }

    public ListElementAdapter(ArrayList<ListElement> elements, RecyclerView recyclerView) {
        this.elements = elements;
        this.recyclerView = recyclerView;
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_element_layout, viewGroup, false);


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return new ListElementViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        ListElement element = elements.get(i);
        Picasso.with(((ListElementViewHolder) viewHolder).image.getContext()).load(element.getImage()).
                resize(250, 250).centerCrop().into(((ListElementViewHolder) viewHolder).image);
        //((ListElementViewHolder) viewHolder).image.setImageURI(element.getImage());
        ((ListElementViewHolder) viewHolder).description.setText(element.getDescription());
    }

    @Override
    public int getItemCount() {
        return elements.size();
    }
}
