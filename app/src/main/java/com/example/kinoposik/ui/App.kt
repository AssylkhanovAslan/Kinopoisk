package com.example.kinoposik.ui

import android.app.Application
import com.example.kinoposik.di.mainModule
import com.example.kinoposik.di.networkModule
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin { modules(mainModule, networkModule) }
    }
}