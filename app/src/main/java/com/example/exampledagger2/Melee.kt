package com.example.exampledagger2

class Melee {

    private val weapon : Weapon = Weapon()

    fun setEquip() : String {
        return "Hero Melee Fight Use " + weapon.sword()
    }
}