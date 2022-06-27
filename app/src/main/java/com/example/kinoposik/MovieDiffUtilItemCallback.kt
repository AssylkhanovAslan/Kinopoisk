package com.example.kinoposik

import androidx.recyclerview.widget.DiffUtil
import com.example.kinoposik.domain.model.Movie

class MovieDiffUtilItemCallback: DiffUtil.ItemCallback<Movie>() {
    override fun areItemsTheSame(oldItem: Movie, newItem: Movie) = oldItem.id == newItem.id
    override fun areContentsTheSame(oldItem: Movie, newItem: Movie) = oldItem == newItem
}