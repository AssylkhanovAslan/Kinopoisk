package com.example.kinoposik

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.databinding.ItemMovieCategoryBinding
import com.example.kinoposik.models.MovieCategory

class MovieCategoryViewHolder(private val binding: ItemMovieCategoryBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private lateinit var adapter: MovieAdapter

    fun bind(movieCategory: MovieCategory) {
        binding.tvCategoryName.text = movieCategory.categoryName
        adapter = MovieAdapter(movieCategory.movies)
        binding.rvMovies.adapter = adapter
    }

    companion object {
        fun inflateFrom(parent: ViewGroup): MovieCategoryViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemMovieCategoryBinding.inflate(layoutInflater, parent, false)
            return MovieCategoryViewHolder(binding)
        }
    }
}