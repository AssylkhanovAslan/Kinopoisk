package com.example.kinoposik.adapters

import androidx.recyclerview.widget.DiffUtil
import com.example.kinoposik.models.MovieCategory

class MovieCategoryDiffCallback(
    private val oldList: List<MovieCategory>,
    var newList: List<MovieCategory>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldList[oldItemPosition]
        val newItem = newList[newItemPosition]
        return oldItem.categoryName == newItem.categoryName
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldList[oldItemPosition]
        val newItem = newList[newItemPosition]
        return oldItem == newItem
    }

}