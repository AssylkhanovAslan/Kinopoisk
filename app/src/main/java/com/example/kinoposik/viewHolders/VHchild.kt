package com.example.kinoposik.viewHolders

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.R
import com.example.kinoposik.models.Movie
import java.util.zip.Inflater

class VHchild(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.child_item, parent, false)) {

    private val imageMovie = itemView.findViewById<ImageView>(R.id.imageView)
    private val movieName = itemView.findViewById<ImageView>(R.id.movieName)

    fun onBind(movie:Movie){

    }
}