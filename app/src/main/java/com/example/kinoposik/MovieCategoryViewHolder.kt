package com.example.kinoposik

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.api.MoviesRepository
import com.example.kinoposik.databinding.ItemMovieCategoryBinding
import com.example.kinoposik.models.Movie
import com.example.kinoposik.models.MovieCategory

class MovieCategoryViewHolder(private val binding: ItemMovieCategoryBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private lateinit var adapter: MovieAdapter

    fun bind(movieCategory: MovieCategory, clickListener: (movie: Movie) -> Unit) {
        binding.tvCategoryName.text = movieCategory.categoryName
        adapter = MovieAdapter(movieCategory.movies, clickListener)
        binding.rvMovies.adapter = adapter

        MoviesRepository.getMovies(
            onSuccess = ::onPopularMoviesFetched,
            onError = ::onError,
            category = movieCategory.categoryPath
        )
    }

    private fun onPopularMoviesFetched(movies: List<Movie>) {
        adapter.updateMovies(movies)
    }

    private fun onError() {
        Toast.makeText(itemView.context, "Error fetching movies", Toast.LENGTH_SHORT).show()
    }

    companion object {
        fun inflateFrom(parent: ViewGroup): MovieCategoryViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemMovieCategoryBinding.inflate(layoutInflater, parent, false)
            return MovieCategoryViewHolder(binding)
        }
    }
}