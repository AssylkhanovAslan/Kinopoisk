package com.example.kinoposik.childrecyclerview

import com.example.kinoposik.models.Movie

interface OnClick {
    fun onImageClick(item: Movie)
}