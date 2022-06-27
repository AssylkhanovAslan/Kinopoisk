package com.example.kinoposik.di

import com.example.kinoposik.data.MoviesRepository
import org.koin.dsl.module

val mainModule = module {
    factory { MoviesRepository(get()) }
}