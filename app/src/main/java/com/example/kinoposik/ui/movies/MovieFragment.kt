package com.example.kinoposik.ui.movies

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kinoposik.MovieAdapter
import com.example.kinoposik.MovieDetailsBottomSheet
import com.example.kinoposik.databinding.FragmentMovieBinding
import com.example.kinoposik.domain.model.Movie
import com.example.kinoposik.network.MoviesRepository

class MovieFragment : Fragment() {

    private var _binding: FragmentMovieBinding? = null
    private val binding get() = _binding!!

    private lateinit var args: MovieFragmentArgs
    private lateinit var adapter: MovieAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setupArguments()
        _binding = FragmentMovieBinding.inflate(inflater, container, false)
        adapter = MovieAdapter { movie: Movie ->
            val dialog = MovieDetailsBottomSheet(movie)
            dialog.show(parentFragmentManager, MovieDetailsBottomSheet.TAG)
        }
        binding.tvCategory.text = args.category
        binding.rvMovies.adapter = adapter

        MoviesRepository.getMovies(
            onSuccess = ::onMoviesFetched,
            onError = ::onError,
            category = args.category
        )
        return binding.root
    }

    private fun setupArguments() {
        val bundle = arguments
        if (bundle == null) {
            Log.e("Movie", "MovieFragment did not receive arguments")
            return
        }
        args = MovieFragmentArgs.fromBundle(bundle)
    }

    private fun onMoviesFetched(movies: List<Movie>) {
        adapter.submitList(movies)
    }

    private fun onError() {
        Log.e(TAG, "Error fetching movies: category = ${args.category}")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "MovieFragment"
    }
}