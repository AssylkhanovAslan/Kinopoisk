package com.example.kinoposik.domain.models

import java.io.Serializable

data class Movie(
    val id: Int,
    val title: String,
    val img: String,
    val description: String,
): Serializable
