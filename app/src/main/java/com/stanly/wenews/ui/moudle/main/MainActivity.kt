package com.stanly.wenews.ui.moudle.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.stanly.wenews.R
import it.sephiroth.android.library.bottomnavigation.BottomNavigation
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    var mBottomNavigation : BottomNavigation? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBottomNavigation = findViewById(R.id.bottomnavigation)
        mBottomNavigation!!.setOnMenuChangedListener { item -> toast(item!!.getMenuItemTitle(item.selectedIndex)) }


    }


}
