package com.example.kinoposik.data.network

import com.example.kinoposik.domain.models.tmdb.MovieResults
import com.example.kinoposik.domain.models.tmdb.rate.RateMovieRequest
import com.example.kinoposik.domain.models.tmdb.rate.RateMovieResult
import retrofit2.http.*

interface MovieService {
    @GET("discover/movie?api_key=c00901ccec94506f96ba9e3769002dcb")
    suspend fun getMovie(): MovieResults

    @POST("movie/{movie_id}/rating")
    suspend fun rateMovie(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String,
        @Body requestBody: RateMovieRequest
    ): RateMovieResult

    @FormUrlEncoded
    @POST("movie/{movie_id}/rating")
    suspend fun rateMovieFormUrl(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String,
        @FieldMap value: Map<String, Any>
    ): RateMovieResult


}