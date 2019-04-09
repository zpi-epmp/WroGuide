package com.wroguide.presenter;

import android.support.v7.widget.RecyclerView;

import com.wroguide.model.ListElement;

import java.util.ArrayList;
import java.util.List;

public abstract class ListPresenter <T extends ListElement> extends BasePresenter {

    protected ListElementAdapter<T> adapter;

    protected void createAndSetAdapter(List<T> list, RecyclerView rcv) {
        adapter = new ListElementAdapter<T>(list, rcv);
    }

    public ListElementAdapter<T> getAdapter() {
        return adapter;
    }
}
