package com.example.kinoposik.di

import com.example.kinoposik.data.MovieRepository
import com.example.kinoposik.presentation.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    factory { MovieRepository(get()) }
    viewModel { MainViewModel(get()) }
}

val modules = listOf(mainModule)