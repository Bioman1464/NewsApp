package com.example.newsapp

import androidx.fragment.app.FragmentManager
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
class MainActivityModule {
    @Provides
    @ActivityScope
    fun provideWizard (): Unit = Unit("Wizard", 1000, 1)

    @Provides
    @ActivityScope
    fun provideActivity(mainActivity: MainActivity) : MainActivity = mainActivity

    @Provides
    @ActivityScope
    fun provideFragmentManager(mainActivity: MainActivity):
            FragmentManager = mainActivity.supportFragmentManager

    @Module
    interface FragmentBindings {
        @ContributesAndroidInjector(modules = [MainFragmentModule::class])
        fun bindMainFragment(): MainFragment
    }
}