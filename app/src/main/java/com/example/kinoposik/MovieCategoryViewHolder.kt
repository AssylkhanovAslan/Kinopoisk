package com.example.kinoposik

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.models.MovieCategory

class MovieCategoryViewHolder(
    inflater: LayoutInflater,
    parent: ViewGroup,
    private val context: Context
) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_category, parent, false)) {
    private val categoryTitle = itemView.findViewById<TextView>(R.id.category_title)
    private val movieRecyclerView = itemView.findViewById<RecyclerView>(R.id.movies_recycler_view)
    private val viewPool = RecyclerView.RecycledViewPool()

    fun bind(item: MovieCategory) {
        categoryTitle.text = item.categoryName

        val movieAdapter = MovieAdapter(context)
        val movieManager =
            LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)

        movieRecyclerView.adapter = movieAdapter
        movieRecyclerView.layoutManager = movieManager
        movieRecyclerView.setRecycledViewPool(viewPool)

        when (item.categoryName) {
            list[0].categoryName -> {
                movieAdapter.setItems(comedy)
            }
            list[1].categoryName -> {
                movieAdapter.setItems(drama)
            }
            list[2].categoryName -> {
                movieAdapter.setItems(anime)
            }
            list[3].categoryName -> {
                movieAdapter.setItems(mults)
            }
            else -> {
                movieAdapter.setItems(musicals)
            }
        }
    }
}