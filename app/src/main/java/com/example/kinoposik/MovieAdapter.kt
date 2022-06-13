package com.example.kinoposik

import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.api.MoviesRepository
import com.example.kinoposik.models.Movie

class MovieAdapter(
    private var movies: List<Movie>,
    private val clickListener: (movie: Movie) -> Unit
) : RecyclerView.Adapter<MovieViewHolder>() {

    private lateinit var parent: ViewGroup

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        this.parent = parent
        return MovieViewHolder.inflateFrom(parent)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]

        holder.bind(movie, clickListener)
    }

    override fun getItemCount() = movies.size

    fun updateMovies(movies: List<Movie>) {
        this.movies = movies
        notifyDataSetChanged()
    }
}
