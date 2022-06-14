package com.example.kinoposik

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.models.Movie

class MovieAdapter(private val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val data = mutableListOf<Movie>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        return MovieViewHolder(inflater, parent, context)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MovieViewHolder).bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    fun setItems(list: MutableList<Movie>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }
}