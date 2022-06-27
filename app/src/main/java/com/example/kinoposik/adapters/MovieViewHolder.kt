package com.example.kinoposik.adapters

import  android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.example.kinoposik.databinding.ItemMovieBinding
import com.example.kinoposik.domain.models.Movie

class MovieViewHolder(private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(movie: Movie, clickListener: (movie: Movie) -> Unit) {
        binding.tvTitle.text = movie.title
        binding.root.setOnClickListener { clickListener(movie) }

        Glide.with(itemView.context)
            .load("$imageUrl${movie.img}")
            .transform(CenterCrop())
            .into(binding.ivPoster)
    }

    companion object {
        private const val imageUrl = "https://image.tmdb.org/t/p/w342"
        fun inflateFrom(parent: ViewGroup) : MovieViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemMovieBinding.inflate(layoutInflater, parent, false)
            return MovieViewHolder(binding)
        }
    }
}