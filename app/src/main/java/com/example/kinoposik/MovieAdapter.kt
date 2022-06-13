package com.example.kinoposik

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.models.Movie

class MovieAdapter(private val movies: List<Movie>) : RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MovieViewHolder.inflateFrom(parent)

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }

    override fun getItemCount() = movies.size
}