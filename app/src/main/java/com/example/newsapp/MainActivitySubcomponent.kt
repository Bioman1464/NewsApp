package com.example.newsapp

import dagger.Component
import dagger.Subcomponent
import dagger.android.AndroidInjector

@ActivityScope
@Subcomponent (modules = [MainActivityModule::class])
interface MainActivitySubcomponent: AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<MainActivity>()
}