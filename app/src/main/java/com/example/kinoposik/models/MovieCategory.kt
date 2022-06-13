package com.example.kinoposik.models

import com.google.gson.annotations.SerializedName

data class MovieCategory(
    val categoryName: String,
    val categoryPath: String,
    @SerializedName("results") val movies: List<Movie>,
)