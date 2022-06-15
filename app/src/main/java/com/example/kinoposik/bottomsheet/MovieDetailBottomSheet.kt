package com.example.kinoposik.bottomsheet

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.kinoposik.R
import com.example.kinoposik.models.Movie
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MovieDetailBottomSheet : BottomSheetDialogFragment() {

    companion object {
        fun newInstance(movie: Movie): MovieDetailBottomSheet {
            val args = Bundle()
            args.putSerializable("key1", movie)

            val fragment = MovieDetailBottomSheet()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.movie_details_btm_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val image: ImageView = view.findViewById(R.id.movie_detail_image)

        val movie: Movie? = arguments?.getSerializable("key1") as? Movie
        movie?.let {
            view.findViewById<TextView>(R.id.movie_name_tv).text = movie.title
            view.findViewById<TextView>(R.id.movie_description_tv).text = movie.description
            setImage(image, movie.img)
        }
    }

    private fun setImage(image: ImageView, url: String) {
        Glide.with(image.context).load(url).into(image)
    }

}