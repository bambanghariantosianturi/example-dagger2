package com.example.exampledagger2

import dagger.Module
import dagger.Provides

@Module
class BattleModule {

    @Provides
    fun setWeapon() : Weapon {
        return Weapon("Sword Ok", "Arrow Wkwk")
    }
}