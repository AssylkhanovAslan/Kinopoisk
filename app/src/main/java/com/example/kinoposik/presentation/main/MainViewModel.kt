package com.example.kinoposik.presentation.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kinoposik.data.MovieRepository
import com.example.kinoposik.domain.models.MovieCategory
import com.example.kinoposik.domain.models.tmdb.TmdbMovie
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: MovieRepository
) : ViewModel() {

    val TAG = this::class.java.simpleName

    val movieCategories = MutableLiveData<List<TmdbMovie>>()
    val userName = MutableLiveData<String>()

    init {
        loadPopularMovies()
    }
    fun loadPopularMovies() {
        viewModelScope.launch {
            val results = repository.getPopularMovies()
            movieCategories.value = results.tmdbMovies
            Log.d(TAG, "Total pages = ${results.total_pages}, Total Results = ${results.total_results}")
        }
    }

}