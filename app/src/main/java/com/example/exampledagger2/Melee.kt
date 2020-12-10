package com.example.exampledagger2

import javax.inject.Inject

class Melee @Inject constructor(private val weapon: Weapon) {

//    private val weapon : Weapon = Weapon()

    fun setEquip(): String {
        return "Hero Melee Fight Use "+weapon.sword()
    }
}