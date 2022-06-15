package com.example.kinoposik.parentrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.MainActivity
import com.example.kinoposik.R
import com.example.kinoposik.models.MovieCategory

class ParentItemAdapter(private val context: Context) : RecyclerView.Adapter<ParentViewHolder>() {

    private val movieCategoryList = mutableListOf<MovieCategory>()
    private val movieCategoryList1 = ArrayList<MovieCategory>()
    private val recyclerViewPool = RecyclerView.RecycledViewPool()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.movie_row_list, parent, false)
        return ParentViewHolder(view, context)
    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {
        val element = movieCategoryList[position]
        holder.bind(element, recyclerViewPool)
    }

    override fun getItemCount(): Int = movieCategoryList.size

    fun setCategoryList(movieCategories: List<MovieCategory>) {
        movieCategoryList.clear()
        movieCategoryList.addAll(movieCategories)
        notifyDataSetChanged()
    }

}