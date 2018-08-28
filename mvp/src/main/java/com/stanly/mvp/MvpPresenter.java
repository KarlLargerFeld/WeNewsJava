package com.stanly.mvp;

import android.support.annotation.UiThread;
import android.view.View;

public interface MvpPresenter<V extends MvpView> {

    @UiThread
    void attachView(V view);

    @UiThread
    void detachView();
}
