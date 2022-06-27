package com.example.kinoposik.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.kinoposik.domain.models.Movie

class MovieAdapter(
    private val clickListener: (movie: Movie) -> Unit
) : ListAdapter<Movie, MovieViewHolder>(MovieDiffUtilItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder =
        MovieViewHolder.inflateFrom(parent)

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = getItem(position)
        holder.bind(movie, clickListener)
    }
}
