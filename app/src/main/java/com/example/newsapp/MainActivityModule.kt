package com.example.newsapp

import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @Provides
    @ActivityScope
    fun provideWizard (): Unit = Unit("Wizard", 1000, 1)
}