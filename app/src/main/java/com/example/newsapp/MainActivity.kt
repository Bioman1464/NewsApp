package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: WarriorPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = DaggerAppComponent.builder()
            .appModule(AppModule())
            .build()

        val warriorScreenComponent = appComponent.warriorScreenComponent(WarriorScreenModule())
        warriorScreenComponent.inject(this)
        Log.d("WarriorScreen", presenter.warrior.name)
    }
}