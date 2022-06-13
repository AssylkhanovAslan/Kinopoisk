package com.example.kinoposik.models

import com.google.gson.annotations.SerializedName

data class MovieCategory(
    @SerializedName("page") val page: Int,
    @SerializedName("total_pages") val pages: Int,
    val categoryName: String,
    @SerializedName("results") val movies: List<Movie>,
)