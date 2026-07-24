package com.food_app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class FoodApp: Application() {
    override fun onCreate() {
        super.onCreate()
    }
}