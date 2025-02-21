package com.example.hdmedi.sharedPreference

import android.app.Application

class MyApplication : Application() {

    companion object{
        lateinit var preferences: PreferenceUtil
    }

    override fun onCreate() {
        preferences = PreferenceUtil(applicationContext)
        super.onCreate()
    }
}