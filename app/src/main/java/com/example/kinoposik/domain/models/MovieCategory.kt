package com.example.kinoposik.domain.models

data class MovieCategory(
    val categoryName: String,
    val movies: List<Movie>,
)