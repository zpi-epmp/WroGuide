package com.wroguide.presenter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wroguide.model.ListElement;

import java.util.ArrayList;
import java.util.List;

public abstract class ListPresenter <T extends ListElement>
        extends BasePresenter implements View.OnClickListener {

    protected ListElementAdapter<T> adapter;


    protected void createAndSetAdapter(List<T> list, RecyclerView rcv, String rodzajListy) {
        adapter = new ListElementAdapter<T>(list, rcv, this, rodzajListy);
    }




    public ListElementAdapter<T> getAdapter() {
        return adapter;
    }
}
