package com.example.kinoposik.domain.models.tmdb

data class MovieResults(
    val page: Int,
    val tmdbMovies: List<TmdbMovie>,
    val total_pages: Int,
    val total_results: Int
)