package com.example.exampledagger2

import dagger.Component

@Component(modules = [BattleModule::class])
interface HeroComponent {
    fun inject(mainActivity: MainActivity)
}