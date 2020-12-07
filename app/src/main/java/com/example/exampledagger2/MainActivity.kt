package com.example.exampledagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //Attribute use anotation inject
//    private val melee: Melee = Melee()
//    private val range: Range = Range()
    @Inject
    lateinit var melee : Melee

    @Inject
    lateinit var range: Range

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Inject this main to client
         */
        DaggerHeroComponent.create().inject(this)

        click_me.setOnClickListener {
            val getFight = melee.setEquip() + " and " + range.setEquip()
            report.text = getFight
        }
    }
}