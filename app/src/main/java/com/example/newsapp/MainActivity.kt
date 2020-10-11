package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var paladin: Unit

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("InjectionTest", paladin.hp.toString())
    }
}