package com.example.newsapp

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [
    MainActivitySubcomponent::class
])
abstract class ActivityModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    abstract fun bindMainActivityInjectorFactory(
        builder: MainActivitySubcomponent.Builder
    ): AndroidInjector.Factory<*>
}