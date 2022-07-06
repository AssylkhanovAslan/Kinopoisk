package com.example.kinoposik.domain.models.tmdb.rate

import com.google.gson.annotations.SerializedName

data class RateMovieRequest(
    @SerializedName("value") val value: Float
)