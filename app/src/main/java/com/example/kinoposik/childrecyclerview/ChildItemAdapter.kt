package com.example.kinoposik.childrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.R
import com.example.kinoposik.models.Movie

class ChildItemAdapter(private val context: Context) : RecyclerView.Adapter<ChildViewHolder>() {

    private val movieList = mutableListOf<Movie>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.movie_row_item, parent, false)
        return ChildViewHolder(view, context)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        val element = movieList[position]
        holder.bind(element)
    }

    override fun getItemCount(): Int = movieList.size

    fun setMovieList(myLocalMovieList: List<Movie>) {
        movieList.clear()
        movieList.addAll(myLocalMovieList)
        notifyDataSetChanged()
    }

}