package com.example.exampledagger2

import dagger.Component

@Component
interface HeroComponent {
    fun inject(mainActivity: MainActivity)
}