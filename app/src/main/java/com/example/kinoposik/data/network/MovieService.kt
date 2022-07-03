package com.example.kinoposik.data.network

import com.example.kinoposik.domain.models.tmdb.MovieResults
import com.example.kinoposik.domain.models.tmdb.TmdbMovie
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

private const val API_KEY = "c00901ccec94506f96ba9e3769002dcb"

interface MovieService {
    @GET("movie/popular")
    suspend fun getMovie(
        @Query("api_key") apiKey:String = API_KEY
    ): MovieResults

    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey:String = API_KEY
    ):TmdbMovie
}