package com.example.kinoposik.childrecyclerview

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kinoposik.MainActivity
import com.example.kinoposik.R
import com.example.kinoposik.models.Movie

class ChildViewHolder(view: View, private val context: Context) : RecyclerView.ViewHolder(view) {

    private val image: ImageView = itemView.findViewById(R.id.movie_image)
    private val title: TextView = itemView.findViewById(R.id.movie_title_tv)

    fun bind(item: Movie) {
        title.text = item.title
        setImage(item.img)
        image.setOnClickListener {
            (context as MainActivity).onImageClick(item)
        }
    }

    private fun setImage(imgUrl: String) {
        Glide.with(itemView.context)
            .load(imgUrl)
            .centerCrop()
            .error(R.drawable.ic_launcher_background)
            .into(image)
    }
}