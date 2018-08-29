package com.stanly.mvp.lce

import android.support.annotation.UiThread

import com.stanly.mvp.MvpView

interface LceView<M> : MvpView {

    @UiThread
    fun showLoading()

    @UiThread
    fun dismissLoading()

    @UiThread
    fun showContent(data: M)

    @UiThread
    fun showError(e: Throwable)

    @UiThread
    fun showEmpty()
}
