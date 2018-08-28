package com.stanly.mvp.lce;

import android.support.annotation.UiThread;

public interface LoadView {

    @UiThread
    public void showLoading();

    @UiThread
    public void dismissLoading();

    @UiThread
    public void error(Throwable e);
}
