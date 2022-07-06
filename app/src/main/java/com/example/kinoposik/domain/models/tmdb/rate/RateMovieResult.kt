package com.example.kinoposik.domain.models.tmdb.rate

import com.google.gson.annotations.SerializedName

data class RateMovieResult(
    @SerializedName("status_code") val statusCode: Int,
    @SerializedName("status_message") val statusMessage: String,
)