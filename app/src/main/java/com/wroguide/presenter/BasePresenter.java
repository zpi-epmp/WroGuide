package com.wroguide.presenter;

/**
 * Created by Piotrek on 08.04.2019.
 */
public abstract class BasePresenter<T> {
    public T view;

    public void attach(T view) {
        this.view = view;
    }

    public void detach() {
        this.view = null;
    }

    public boolean isViewAttached(){
        return this.view != null;
    }
}
