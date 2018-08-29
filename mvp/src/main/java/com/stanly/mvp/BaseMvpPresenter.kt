package com.stanly.mvp

class BaseMvpPresenter<V : MvpView> : MvpPresenter<V> {

    private var mvpView: V? = null


    val isViewAttached: Boolean
        get() = mvpView != null

    override fun attachView(view: V) {
        mvpView = view
    }

    override fun detachView() {
        mvpView = null
    }

    fun checkViewAttached() {
        if (!isViewAttached) throw MvpViewNotAttachedException()
    }

    class MvpViewNotAttachedException : RuntimeException("Please call Presenter.attachView(MvpView) before" + " requesting data to the Presenter")
}
