package com.example.kinoposik.adapters

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.example.kinoposik.presentation.MovieDetailsBottomSheetDialog
import com.example.kinoposik.R
import com.example.kinoposik.models.MovieCategory


class MovieCategoryAdapter(private val context: Context) : RecyclerView.Adapter<MovieCategoryAdapter.MovieCategoryViewHolder>() {

    private val viewPool = RecycledViewPool()

    inner class MovieCategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    private val oldList = mutableListOf<MovieCategory>()

    private val diffCallback = MovieCategoryDiffCallback(oldList, mutableListOf())

    fun submitList(updatedList: List<MovieCategory>) {
        diffCallback.newList = updatedList
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        oldList.clear()
        oldList.addAll(updatedList)
        diffResult.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCategoryViewHolder {
        return MovieCategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.rv_movie_categories,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MovieCategoryViewHolder, position: Int) {
        val movieCategory = oldList[position]

        val moviesRecyclerView = holder.itemView.findViewById<RecyclerView>(R.id.rv_movies)

        val linearLayoutManager = LinearLayoutManager(
            moviesRecyclerView.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        linearLayoutManager.initialPrefetchItemCount = movieCategory.movies.size

        val movieAdapter = MovieAdapter(context)
        movieAdapter.submitList(movieCategory.movies)

        val manager: FragmentManager = (context as AppCompatActivity).supportFragmentManager
        movieAdapter.setOnMovieClickListener {
            val movieDetailsBottomSheetDialog = MovieDetailsBottomSheetDialog()
            val bundle = Bundle()
            bundle.putParcelable("Movie", it)
            movieDetailsBottomSheetDialog.arguments = bundle
            movieDetailsBottomSheetDialog.show(manager, null)
        }

        moviesRecyclerView.layoutManager = linearLayoutManager
        moviesRecyclerView.adapter = movieAdapter
        moviesRecyclerView.setRecycledViewPool(viewPool)

        val txtMovieCategoryName = holder.itemView.findViewById<TextView>(R.id.txt_movie_category_name)

        holder.itemView.apply {
            txtMovieCategoryName.text = movieCategory.categoryName
        }
    }

    override fun getItemCount(): Int = oldList.size

}