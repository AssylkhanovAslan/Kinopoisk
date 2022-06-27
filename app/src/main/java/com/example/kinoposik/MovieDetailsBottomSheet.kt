package com.example.kinoposik

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kinoposik.databinding.BottomSheetMovieDetailsBinding
import com.example.kinoposik.domain.model.Movie
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MovieDetailsBottomSheet(private val movie: Movie) : BottomSheetDialogFragment() {

    private var _binding: BottomSheetMovieDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BottomSheetMovieDetailsBinding.inflate(inflater, container, false)
        binding.tvMovieTitle.text = movie.title
        binding.tvMovieDescription.text = movie.description
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "MovieDetailsBottomSheet"
    }
}