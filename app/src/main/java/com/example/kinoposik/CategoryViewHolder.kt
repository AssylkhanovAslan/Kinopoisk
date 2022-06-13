package com.example.kinoposik

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.databinding.ItemMovieCategoryBinding
import com.example.kinoposik.models.MovieCategory

class CategoryViewHolder(private val binding: ItemMovieCategoryBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(movieCategory: MovieCategory) {
        binding.tvCategoryName.text = movieCategory.categoryName
    }

    companion object {
        fun inflateFrom(parent: ViewGroup): CategoryViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemMovieCategoryBinding.inflate(layoutInflater, parent, false)
            return CategoryViewHolder(binding)
        }
    }
}