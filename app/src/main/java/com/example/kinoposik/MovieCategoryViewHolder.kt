package com.example.kinoposik

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.network.MoviesRepository
import com.example.kinoposik.databinding.ItemMovieCategoryBinding
import com.example.kinoposik.domain.model.Movie
import com.example.kinoposik.domain.model.MovieCategory

class MovieCategoryViewHolder(
    private val binding: ItemMovieCategoryBinding,
    private val onClick: (String) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    private lateinit var adapter: MovieAdapter

    fun bind(movieCategory: MovieCategory, clickListener: (movie: Movie) -> Unit) {
        binding.tvCategoryName.text = movieCategory.categoryName
        adapter = MovieAdapter(clickListener)
        binding.rvMovies.adapter = adapter
        binding.ibMore.setOnClickListener { onClick(movieCategory.categoryPath) }

        MoviesRepository.getMovies(
            onSuccess = ::onMoviesFetched,
            onError = ::onError,
            category = movieCategory.categoryPath
        )
    }

    private fun onMoviesFetched(movies: List<Movie>) {
        adapter.submitList(movies)
    }

    private fun onError() {
        Toast.makeText(itemView.context, "Error fetching movies", Toast.LENGTH_SHORT).show()
    }

    companion object {
        fun inflateFrom(parent: ViewGroup, onArrowClick: (String) -> Unit): MovieCategoryViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemMovieCategoryBinding.inflate(layoutInflater, parent, false)
            return MovieCategoryViewHolder(binding, onArrowClick)
        }
    }
}