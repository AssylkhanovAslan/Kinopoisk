package com.example.kinoposik.presentation.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kinoposik.databinding.ItemMovieBinding
import com.example.kinoposik.domain.models.tmdb.TmdbMovie
import com.example.kinoposik.utils.Constants.imageUrl

class MovieViewHolder(val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {


    fun bind(movie: TmdbMovie, onClick:(Int)->Unit) {
        binding.title.text = movie.title

        Glide.with(itemView.context)
            .load(imageUrl + movie.posterPath)
            .into(binding.poster)

        binding.poster.setOnClickListener{
            val id = movie.id ?: return@setOnClickListener
            onClick(id)
        }
    }

    companion object {
        fun inflateFrom(parent: ViewGroup): MovieViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemMovieBinding.inflate(layoutInflater, parent, false)
            return MovieViewHolder(binding)
        }
    }


}