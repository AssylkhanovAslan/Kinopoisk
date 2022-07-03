package com.example.kinoposik.domain.models.tmdb

import com.google.gson.annotations.SerializedName

data class MovieResults(

    @SerializedName("page") var page: Int? = null,
    @SerializedName("results") var tmdbMovies: ArrayList<TmdbMovie> = arrayListOf(),
    @SerializedName("total_pages") var totalPages: Int? = null,
    @SerializedName("total_results") var totalResults: Int? = null

)