package com.stanly.mvp

import android.support.annotation.UiThread
import android.view.View

interface MvpPresenter<V : MvpView> {

    @UiThread
    fun attachView(view: V)

    @UiThread
    fun detachView()
}
