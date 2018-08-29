package com.stanly.wenews.common

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by StanlyFang on 2018/8/29.
 */
class ImageLoader {
    companion object {

        //加载普通图片
        fun load(context:Context,source:Any,view:ImageView){
            Glide.with(context)
                    .load(source)
                    .into(view)
        }
    }
}