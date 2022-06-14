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

class InfoBottomSheet(private val movie: Movie) : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.info_bottom_sheet, container, false)
        val title = view.findViewById<TextView>(R.id.title)
        val img = view.findViewById<ImageView>(R.id.img)
        val info = view.findViewById<TextView>(R.id.info)

        title.text = movie.title
        info.text = movie.description
        Glide.with(view.context).load(movie.img).centerCrop().into(img)

        return view
    }
}