package com.example.kinoposik.data.network

import com.example.kinoposik.domain.models.tmdb.MovieResults
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {
    @GET("discover/movie?api_key=c00901ccec94506f96ba9e3769002dcb")
    suspend fun getMovie(): MovieResults
}