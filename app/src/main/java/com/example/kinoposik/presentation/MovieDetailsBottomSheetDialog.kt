package com.example.kinoposik.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.example.kinoposik.R
import com.example.kinoposik.models.Movie
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MovieDetailsBottomSheetDialog : BottomSheetDialogFragment()  {

    @Inject
    lateinit var glide: RequestManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.BottomSheetDialogStyle)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val currentView =
            inflater.inflate(R.layout.dialog_movie_details, container, false)

        val ivMoviePoster = currentView.findViewById<ImageView>(R.id.iv_movie_poster)
        val tvMovieTitle = currentView.findViewById<TextView>(R.id.tv_movie_title)
        val tvMovieDescription = currentView.findViewById<TextView>(R.id.tv_movie_description)

        val movie = arguments?.getParcelable<Movie>("Movie")

        glide
            .load(movie?.imgUrl)
            .into(ivMoviePoster)

        tvMovieTitle.text = movie?.title
        tvMovieDescription.text = movie?.description

        return currentView
    }

}