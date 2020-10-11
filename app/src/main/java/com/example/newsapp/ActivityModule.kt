package com.example.newsapp

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [
        MainActivityModule::class
    ])
    abstract fun bindMainActivity(): MainActivity
}