package com.stanly.wenews

import android.app.Application
import com.stanly.wenews.common.AppLog

class WeNewsApplication : Application(){

    override fun onCreate() {
        super.onCreate()

       AppLog.init()
    }
}
