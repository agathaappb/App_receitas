package com.agathaappb.designer_coffe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_receitas)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

    }
}