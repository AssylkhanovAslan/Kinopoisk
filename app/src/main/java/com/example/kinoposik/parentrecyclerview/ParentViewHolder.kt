package com.example.kinoposik.parentrecyclerview

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.R
import com.example.kinoposik.childrecyclerview.ChildItemAdapter
import com.example.kinoposik.models.MovieCategory

class ParentViewHolder(view: View, private val context: Context) : RecyclerView.ViewHolder(view) {

    private val category: TextView = itemView.findViewById(R.id.category_text_view)
    private val childRecyclerView: RecyclerView = itemView.findViewById(R.id.rv_child)

    fun bind(element: MovieCategory, recyclerViewPool: RecyclerView.RecycledViewPool) {
        category.text = element.categoryName

        val childAdapter = ChildItemAdapter(context)
        childAdapter.setMovieList(element.movies)

        with(childRecyclerView) {
            layoutManager = LinearLayoutManager(childRecyclerView.context, LinearLayoutManager.HORIZONTAL, false)
            adapter = childAdapter
            setRecycledViewPool(recyclerViewPool)
        }

    }
}