package com.example.kinoposik

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.models.MovieCategory

class MovieCategoryAdapter(private val movieCategories: List<MovieCategory>) :
    RecyclerView.Adapter<MovieCategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MovieCategoryViewHolder.inflateFrom(parent)

    override fun onBindViewHolder(holder: MovieCategoryViewHolder, position: Int) {
        val category = movieCategories[position]
        holder.bind(category)
    }

    override fun getItemCount() = movieCategories.size
}