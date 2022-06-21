package com.example.kinoposik.presentation.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kinoposik.data.MovieRepository
import com.example.kinoposik.domain.models.MovieCategory

class MainViewModel(
    private val repository: MovieRepository
) : ViewModel() {

    val movieCategories = MutableLiveData<List<MovieCategory>>()

    init {
        loadMovieCategories()
    }

    fun loadMovieCategories() {
        movieCategories.value = repository.getMovieCategories()
    }

}