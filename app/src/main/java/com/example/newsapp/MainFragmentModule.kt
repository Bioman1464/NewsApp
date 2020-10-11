package com.example.newsapp

import dagger.Module
import dagger.Provides

@Module
class MainFragmentModule {

    @Provides
    fun provideHero (): Unit = Unit("Hero", 100, 1)
}