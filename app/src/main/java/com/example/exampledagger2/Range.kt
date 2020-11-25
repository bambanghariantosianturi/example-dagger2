package com.example.exampledagger2

class Range {

    private val weapon : Weapon = Weapon()

    fun setEquip() : String {
        return "Hero Range Fight Use " + weapon.arrow()
    }
}