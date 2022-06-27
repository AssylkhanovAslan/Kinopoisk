package com.example.kinoposik.adapters

import androidx.recyclerview.widget.DiffUtil
import com.example.kinoposik.domain.models.Movie

class MovieDiffUtilItemCallback: DiffUtil.ItemCallback<Movie>() {
    override fun areItemsTheSame(oldItem: Movie, newItem: Movie) = oldItem.id == newItem.id
    override fun areContentsTheSame(oldItem: Movie, newItem: Movie) = oldItem == newItem
}