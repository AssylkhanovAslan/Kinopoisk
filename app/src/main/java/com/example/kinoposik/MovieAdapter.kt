package com.example.kinoposik

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.kinoposik.models.Movie

class MovieAdapter(
    private val clickListener: (movie: Movie) -> Unit
) : ListAdapter<Movie, MovieViewHolder>(MovieDiffUtilItemCallback()) {

    private lateinit var parent: ViewGroup

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        this.parent = parent
        return MovieViewHolder.inflateFrom(parent)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = getItem(position)
        holder.bind(movie, clickListener)
    }
}
