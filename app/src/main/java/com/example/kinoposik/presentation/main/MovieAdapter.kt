package com.example.kinoposik.presentation.main


import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.kinoposik.domain.models.tmdb.TmdbMovie

class MovieAdapter(private val onClick: (Int) -> Unit = {}) :
    ListAdapter<TmdbMovie, MovieViewHolder>(MovieDiffUtilCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder.inflateFrom(parent)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(getItem(position), onClick)
    }

}

class MovieDiffUtilCallBack : DiffUtil.ItemCallback<TmdbMovie>() {
    override fun areItemsTheSame(oldItem: TmdbMovie, newItem: TmdbMovie): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: TmdbMovie, newItem: TmdbMovie): Boolean {
        return oldItem == newItem
    }

}