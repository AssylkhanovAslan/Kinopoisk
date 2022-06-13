package com.example.kinoposik.api

import com.example.kinoposik.models.MovieCategory
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api-key") apiKey: String = "8b2b757a98837cb27f8fe0a3d9b95818",
        @Query("page") page: Int
    ) : Call<MovieCategory>
}