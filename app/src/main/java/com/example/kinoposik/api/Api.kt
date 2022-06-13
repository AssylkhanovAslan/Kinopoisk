package com.example.kinoposik.api

import com.example.kinoposik.models.MovieCategory
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {

    @GET("movie/{category}")
    fun getMovies(
        @Path("category") category: String,
        @Query("api_key") apiKey: String = "8b2b757a98837cb27f8fe0a3d9b95818"
    ) : Call<MovieCategory>
}