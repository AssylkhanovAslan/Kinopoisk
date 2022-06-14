package com.example.kinoposik

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kinoposik.models.Movie

class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup, private val context: Context) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_movie, parent, false)) {
    private val movieTitle = itemView.findViewById<TextView>(R.id.movie_title)
    private val movieImg = itemView.findViewById<ImageView>(R.id.movie_img)

    fun bind(item: Movie) {
        movieTitle.text = item.title
        Glide.with(itemView.context).load(item.img).centerCrop().into(movieImg)

        movieImg.setOnClickListener {
            val infoBottomSheet = InfoBottomSheet(item)
            infoBottomSheet.show((context as AppCompatActivity).supportFragmentManager, null)
        }
    }
}