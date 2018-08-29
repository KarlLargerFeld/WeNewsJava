package com.stanly.mvp.lce

import android.support.annotation.UiThread

interface LoadView {

    @UiThread
    fun showLoading()

    @UiThread
    fun dismissLoading()

    @UiThread
    fun error(e: Throwable)
}
