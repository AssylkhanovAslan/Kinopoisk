package com.example.kinoposik.data

import com.example.kinoposik.data.network.MovieService
import com.example.kinoposik.domain.models.MovieCategory
import com.example.kinoposik.domain.models.tmdb.MovieResults
import retrofit2.Retrofit

class MovieRepository(private val dataSource: DataSource, private val retrofit: Retrofit) {

    val service = retrofit.create(MovieService::class.java)

    fun getMovieCategories(): List<MovieCategory> {
        return dataSource.getMovieCategories()
    }

    suspend fun getPopularMovies(): MovieResults {
        return service.getMovie()
    }
}