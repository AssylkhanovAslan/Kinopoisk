package com.example.kinoposik

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.kinoposik.models.Movie
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MovieDetailsBottomSheetDialog : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.movie_details_bottom_sheet, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ivMoviePoster = view.findViewById<ImageView>(R.id.movieImage)
        val tvMovieTitle = view.findViewById<TextView>(R.id.textView)
        val tvMovieDescription = view.findViewById<TextView>(R.id.description)

        val movie = arguments?.getParcelable<Movie>("Movie")

        Glide.with(requireContext())
            .load(movie?.img)
            .into(ivMoviePoster)

        tvMovieTitle.text = movie?.title
        tvMovieDescription.text = movie?.description

    }
}