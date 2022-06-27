package com.example.kinoposik.data.network

import com.example.kinoposik.domain.models.Movie
import com.example.kinoposik.domain.models.MovieCategory
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {

    @GET("movie/{category}")
    fun getMovies(
        @Path("category") category: String,
        @Query("api_key") apiKey: String = "8b2b757a98837cb27f8fe0a3d9b95818"
    ) : Call<MovieCategory>

    @GET("movie/{movie_id}")
    fun getMovie(
        @Path("movie_id") id: Int,
        @Query("api_key") apiKey: String = "8b2b757a98837cb27f8fe0a3d9b95818"
    ) : Call<Movie>
}