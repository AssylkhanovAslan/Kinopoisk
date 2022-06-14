package com.example.kinoposik.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    val title: String,
    val img: String,
    val description: String,
) : Parcelable
