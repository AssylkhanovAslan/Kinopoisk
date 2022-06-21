package com.example.kinoposik.data

import com.example.kinoposik.domain.models.MovieCategory

class MovieRepository(private val dataSource: DataSource) {

    fun getMovieCategories(): List<MovieCategory> {
        return dataSource.getMovieCategories()
    }
}