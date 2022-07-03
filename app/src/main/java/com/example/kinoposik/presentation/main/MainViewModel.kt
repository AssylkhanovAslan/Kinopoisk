package com.example.kinoposik.presentation.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kinoposik.data.MovieRepository
import com.example.kinoposik.domain.models.tmdb.TmdbMovie
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: MovieRepository
) : ViewModel() {

    val TAG = this::class.java.simpleName

    val movieCategories = MutableLiveData<List<TmdbMovie>>()
    val userName = MutableLiveData<String>()
    val movieDetails = MutableLiveData<TmdbMovie>()

    init {
        loadPopularMovies()
    }

    fun loadPopularMovies() {
        viewModelScope.launch {
            val results = repository.getPopularMovies()
            movieCategories.value = results.tmdbMovies
            Log.e(TAG, "${movieCategories.value}")
            Log.d(TAG, "Total pages = ${results.totalPages}, Total Results = ${results.totalResults}")
        }
    }

    fun loadMovieDetails(movieId:Int){
        viewModelScope.launch {
            val results = repository.getMovieDetails(movieId)
            movieDetails.value = results
        }
    }
}