package com.example.kinoposik.presentation

import android.app.Application
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin { modules(com.example.kinoposik.di.modules) }
    }
}