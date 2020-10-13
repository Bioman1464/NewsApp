package com.example.newsapp

import dagger.Component
import dagger.Module
import dagger.Provides
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
@Component(
    modules = [WarriorScreenModule::class],
    dependencies = [AppComponent::class]
)
interface WarriorScreenComponent {
    fun inject(warriorActivity: MainActivity)
}