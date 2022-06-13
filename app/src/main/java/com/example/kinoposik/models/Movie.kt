package com.example.kinoposik.models

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("id") val id: Long,
    @SerializedName("title") val title: String,
    @SerializedName("poster_path") val img: String,
    @SerializedName("overview") val description: String,
)
