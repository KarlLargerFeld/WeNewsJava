package com.stanly.mvp.lce;

import android.support.annotation.UiThread;

import com.stanly.mvp.MvpView;

public interface LceView<M> extends MvpView {

    @UiThread
    public void showLoading();

    @UiThread
    public void dismissLoading();

    @UiThread
    public void showContent(M data);

    @UiThread
    public void showError(Throwable e);

    @UiThread
    public void showEmpty();
}
