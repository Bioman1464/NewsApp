package com.example.newsapp

import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import javax.inject.Scope


@Scope
@Retention
annotation class WarriorScreenScope

class WarriorPresenter(val warrior: Warrior) {}

@Module
class WarriorScreenModule {
    @Provides
    @WarriorScreenScope
    fun provideWarriorPresenter(warrior: Warrior): WarriorPresenter {
        return WarriorPresenter(warrior)
    }
}

@WarriorScreenScope
@Subcomponent(
    modules = [WarriorScreenModule::class]
)
interface WarriorScreenComponent {
    fun inject(warriorActivity: MainActivity)
}