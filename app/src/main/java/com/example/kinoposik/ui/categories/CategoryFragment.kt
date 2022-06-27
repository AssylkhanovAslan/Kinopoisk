package com.example.kinoposik.ui.categories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.kinoposik.adapters.MovieCategoryAdapter
import com.example.kinoposik.ui.moviedetails.MovieDetailsBottomSheet
import com.example.kinoposik.R
import com.example.kinoposik.data.MoviesRepository
import com.example.kinoposik.databinding.FragmentCategoryBinding
import com.example.kinoposik.domain.models.Movie
import com.example.kinoposik.domain.models.MovieCategory
import org.koin.android.ext.android.inject

class CategoryFragment : Fragment() {

    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: MovieCategoryAdapter
    private val moviesRepository: MoviesRepository by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)

        val movieCategories = mutableListOf<MovieCategory>()
        movieCategories.add(MovieCategory("Popular", "popular", listOf()))
        movieCategories.add(MovieCategory("Top rated", "top_rated", listOf()))
        movieCategories.add(MovieCategory("Upcoming", "upcoming", listOf()))

        val onPosterClick = { movie: Movie ->
            val dialog = MovieDetailsBottomSheet(movie)
            dialog.show(parentFragmentManager, MovieDetailsBottomSheet.TAG)
        }

        val onArrayClick = { category: String ->
            val direction = CategoryFragmentDirections.actionCategoryFragmentToMovieFragment(category)
            requireActivity().findNavController(R.id.nav_host_fragment_container)
                .navigate(direction)
        }

        adapter = MovieCategoryAdapter(moviesRepository, movieCategories, onPosterClick, onArrayClick)

        binding.rvMovieCategories.adapter = adapter
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}