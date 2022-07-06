package com.example.kinoposik.data

import com.example.kinoposik.data.network.MovieService
import com.example.kinoposik.di.API_KEY
import com.example.kinoposik.domain.models.MovieCategory
import com.example.kinoposik.domain.models.tmdb.MovieResults
import com.example.kinoposik.domain.models.tmdb.rate.RateMovieRequest
import com.example.kinoposik.domain.models.tmdb.rate.RateMovieResult
import retrofit2.Retrofit

class MovieRepository(private val retrofit: Retrofit) {

    val service = retrofit.create(MovieService::class.java)

    suspend fun getPopularMovies(): MovieResults {
        return service.getMovie()
    }

    suspend fun rateMovie(movieId: Int, rating: Float): RateMovieResult {
        val requestBody = RateMovieRequest(value = rating)
        return service.rateMovie(
            apiKey = API_KEY,
            movieId = movieId,
            requestBody = requestBody
        )
    }

    suspend fun rateMovieForm(movieId: Int, rating: Float): RateMovieResult {
        val fieldMap = hashMapOf<String, Any>()
        fieldMap["value"] = 10f
        return service.rateMovieFormUrl(
            apiKey = API_KEY,
            movieId = movieId,
            value = fieldMap
        )
    }
}