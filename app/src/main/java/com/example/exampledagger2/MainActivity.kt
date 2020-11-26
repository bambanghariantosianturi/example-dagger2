package com.example.exampledagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Attribute
    private val melee: Melee = Melee()
    private val range: Range = Range()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click_me.setOnClickListener {
            val getFight = melee.setEquip() + " and " + range.setEquip()
            report.text = getFight
        }
    }
}