package com.example.kinoposik.di

import com.example.kinoposik.data.DataSource
import com.example.kinoposik.data.MovieRepository
import com.example.kinoposik.presentation.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val mainModule = module {
    factory { DataSource() }
    factory { MovieRepository(get(), get()) }
    viewModel { MainViewModel(get()) }
}

val modules = listOf(mainModule)