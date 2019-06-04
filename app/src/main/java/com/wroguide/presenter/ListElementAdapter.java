package com.wroguide.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.wroguide.R;
import com.wroguide.model.ListElement;
import com.wroguide.model.Place;
import com.wroguide.model.Route;
import com.wroguide.view.PlaceActivity;
import com.wroguide.view.RouteActivity;

import java.io.File;
import java.util.List;

public class ListElementAdapter <T extends ListElement> extends RecyclerView.Adapter {

    private List<T> elements;
    private RecyclerView recyclerView;
    private ListPresenter presenter;
    String rodzajListy;

    private class ListElementViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public TextView content;
        public TextView title;
        public CheckBox checkbox;

        public ListElementViewHolder(View item) {
            super(item);
            image = item.findViewById(R.id.list_element_image);
            content = item.findViewById(R.id.list_element_content);
            title = item.findViewById(R.id.list_element_title);
            checkbox = item.findViewById(R.id.checkBox);
            if(rodzajListy.equals("trasy"))
            checkbox.setVisibility(View.INVISIBLE);
        }
    }

    public ListElementAdapter(List<T> elements, RecyclerView recyclerView, ListPresenter presenter, String rodzajListy) {
        this.elements = elements;
        this.recyclerView = recyclerView;
        this.presenter = presenter;
        this.rodzajListy=rodzajListy;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_element_layout, viewGroup, false);
        view.setOnClickListener(presenter);

        return new ListElementViewHolder(view);
    }



    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        final ListElement element = elements.get(i);
        String source = MyDir.dir + "/" + element.getImage();
        File file = new File(source);
        if(file.exists()) {
            System.out.println("ADAPTER USES IMAGE");
            Picasso.with(((ListElementViewHolder) viewHolder).image.getContext()).
                    load(file).fit().centerCrop().into(((ListElementViewHolder) viewHolder).image);
        }
        else{
            System.out.println("ADAPTER USES URL");
            source = element.getUrl();
            Picasso.with(((ListElementViewHolder) viewHolder).image.getContext()).
                    load(source).fit().centerCrop().into(((ListElementViewHolder) viewHolder).image);
        }
        ((ListElementViewHolder) viewHolder).content.setText(element.getContent());
        ((ListElementViewHolder) viewHolder).title.setText(element.getTitle());




        ((ListElementViewHolder) viewHolder).checkbox.setOnCheckedChangeListener(null);
        ((ListElementViewHolder) viewHolder).checkbox.setChecked(element.isSelected());
        ((ListElementViewHolder) viewHolder).checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //set your object's last status
                element.setSelected(isChecked);
            }
        });
    }

    @Override
    public int getItemCount() {
        return elements.size();
    }

    public List<T> getElements() {
        return elements;
    }

    public RecyclerView getRecyclerView() {
        return recyclerView;
    }
}
