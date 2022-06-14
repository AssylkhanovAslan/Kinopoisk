package com.example.kinoposik.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.kinoposik.R
import com.example.kinoposik.models.Movie
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent


class MovieAdapter(context: Context) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    var glide: RequestManager

    @EntryPoint
    @InstallIn(SingletonComponent::class)
    interface MyEntryPoint {
        fun getGlideInstance(): RequestManager
    }

    init {
        val myEntryPoint = EntryPointAccessors.fromApplication(context, MyEntryPoint::class.java)
        glide = myEntryPoint.getGlideInstance()
    }

    inner class MovieViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    private val oldList = mutableListOf<Movie>()

    private val diffCallback = MovieDiffCallback(oldList, mutableListOf())

    fun submitList(updatedList: List<Movie>) {
        diffCallback.newList = updatedList
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        oldList.clear()
        oldList.addAll(updatedList)
        diffResult.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.rv_movie,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = oldList[position]

        val imgMoviePoster = holder.itemView.findViewById<ImageView>(R.id.img_movie_poster)
        val txtMovieTitle = holder.itemView.findViewById<TextView>(R.id.txt_movie_title)

        holder.itemView.apply {
            glide
                .load(movie.imgUrl)
                .centerCrop()
                .into(imgMoviePoster)
            txtMovieTitle.text = movie.title

            setOnClickListener {
                onMovieClickListener?.let { it(movie) }
            }
        }
    }

    override fun getItemCount(): Int = oldList.size

    private var onMovieClickListener: ((Movie) -> Unit)? = null

    fun setOnMovieClickListener(listener: (Movie) -> Unit) {
        onMovieClickListener = listener
    }
}