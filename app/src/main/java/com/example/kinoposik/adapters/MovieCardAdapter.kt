package com.example.kinoposik.adapters

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kinoposik.MovieDetailsBottomSheetDialog
import com.example.kinoposik.R
import com.example.kinoposik.models.Movie
import com.example.kinoposik.viewHolders.VHchild


class MovieCardAdapter(val context: Context) : RecyclerView.Adapter<VHchild>() {

    val listOfMovies = mutableListOf<Movie>()




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHchild {
        return VHchild(
            LayoutInflater.from(parent.context).inflate(R.layout.child_item, parent, false)
        )
    }


    override fun onBindViewHolder(holder: VHchild, position: Int) {
        val imageMovie = holder.itemView.findViewById<ImageView>(R.id.imageView)
        val movieName = holder.itemView.findViewById<TextView>(R.id.movieName)
        val movie = listOfMovies[position]
        holder.itemView.setOnClickListener {
            val movieDetailsBottomSheetDialog = MovieDetailsBottomSheetDialog()
            val bundle = Bundle()
            bundle.putParcelable("Movie", movie)
            movieDetailsBottomSheetDialog.arguments = bundle
            movieDetailsBottomSheetDialog.show((context as AppCompatActivity).supportFragmentManager,null)
        }
        holder.itemView.apply {
            Glide.with(context)
                .load(movie.img)
                .placeholder(R.drawable.ic_launcher_background)
                .centerCrop()
                .into(imageMovie)
            movieName.text = movie.title
        }


    }


    override fun getItemCount(): Int {
        return listOfMovies.size
    }


    fun setItems(list: List<Movie>) {
        listOfMovies.clear()
        listOfMovies.addAll(list)
        notifyDataSetChanged()
    }

}
