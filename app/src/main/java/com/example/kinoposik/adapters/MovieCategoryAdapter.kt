package com.example.kinoposik.adapters

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.MovieDetailsBottomSheetDialog
import com.example.kinoposik.R
import com.example.kinoposik.models.MovieCategory
import com.example.kinoposik.models.MovieLinks
import com.example.kinoposik.models.MovieLinks.movieCategory
import com.example.kinoposik.viewHolders.VHparent

class MovieCategoryAdapter(val context: Context) : RecyclerView.Adapter<VHparent>() {

    private val data = mutableListOf<MovieCategory>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHparent {
        return VHparent(
            LayoutInflater.from(parent.context).inflate(R.layout.parent_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: VHparent, position: Int) {

         val movieCategoryTitle = holder.itemView.findViewById<TextView>(R.id.parent_item_title)
         val recyclerViewChild = holder.itemView.findViewById<RecyclerView>(R.id.child_recyclerview)

        val movieCategory = data[position]
        movieCategoryTitle.text = movieCategory.categoryName

        recyclerViewChild.apply {
            val childLayoutManager =
                LinearLayoutManager(holder.itemView.context, RecyclerView.HORIZONTAL, false)

            setHasFixedSize(true)
            layoutManager = childLayoutManager
            val adapter = MovieCardAdapter(context)
            adapter.setHasStableIds(true)
            adapter.setItems(movieCategory.movies)
            this.adapter = adapter

        }


    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun setItems(list: List<MovieCategory>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }

}