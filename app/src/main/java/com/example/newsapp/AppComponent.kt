package com.example.newsapp

import dagger.Component
import dagger.Module
import dagger.Provides


data class Warrior(val name: String)

@AppScope
@Component(modules = [
    AppModule::class
])
interface AppComponent {
    fun getWarrior():Warrior
    fun warriorScreenComponent(warriorScreenModule: WarriorScreenModule)
            : WarriorScreenComponent
}

@Module
class AppModule {
    private var index = 0

    @AppScope
    @Provides
    fun provideWarrior(): Warrior {
        index++
        return Warrior("My name is $index")
    }
}

