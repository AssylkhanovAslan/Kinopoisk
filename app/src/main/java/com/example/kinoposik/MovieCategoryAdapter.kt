package com.example.kinoposik

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.models.MovieCategory

class MovieCategoryAdapter(private val movieCategories: List<MovieCategory>) :
    RecyclerView.Adapter<CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CategoryViewHolder.inflateFrom(parent)

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = movieCategories[position]
        holder.bind(category)
    }

    override fun getItemCount() = movieCategories.size
}