package com.stanly.wenews.common

import android.util.Log
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.stanly.wenews.BuildConfig

/**
 * Created by StanlyFang on 2018/8/29.
 */
class AppLog {

    companion object {

        fun init() = Logger.addLogAdapter(object : AndroidLogAdapter(){
            override fun isLoggable(priority: Int, tag: String?): Boolean {
                return BuildConfig.DEBUG
            }
        })

        fun i(msg:String) = Logger.i(msg)

        fun d(msg:String) = Logger.d(msg)

        fun e(msg: String) = Logger.e(msg)

        fun w(msg: String) =Logger.w(msg)
    }



}