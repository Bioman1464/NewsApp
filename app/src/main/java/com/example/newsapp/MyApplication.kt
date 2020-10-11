package com.example.newsapp

import android.app.Application
import android.util.Log

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        val appComponent = DaggerAppComponent.builder()
            .appModule(AppModule())
            .build()
        Log.d("Warriors", "Warrior: ${appComponent.getWarrior().name}")
        Log.d("Warriors", "Warrior: ${appComponent.getWarrior().name}")
    }

}