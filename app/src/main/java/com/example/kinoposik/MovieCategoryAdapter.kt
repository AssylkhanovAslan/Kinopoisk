package com.example.kinoposik

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.domain.model.Movie
import com.example.kinoposik.domain.model.MovieCategory

class MovieCategoryAdapter(
    private val movieCategories: List<MovieCategory>,
    private val onPosterClick: (movie: Movie) -> Unit,
    private val onArrowClick: (category: String) -> Unit
) : RecyclerView.Adapter<MovieCategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MovieCategoryViewHolder.inflateFrom(parent, onArrowClick)

    override fun onBindViewHolder(holder: MovieCategoryViewHolder, position: Int) {
        val category = movieCategories[position]
        holder.bind(category, onPosterClick)
    }

    override fun getItemCount() = movieCategories.size
}