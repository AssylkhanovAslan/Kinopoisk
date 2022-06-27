package com.example.kinoposik.domain.models

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("poster_path") val img: String,
    @SerializedName("overview") val description: String,
)
