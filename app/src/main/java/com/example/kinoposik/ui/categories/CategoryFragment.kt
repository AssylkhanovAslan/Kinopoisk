package com.example.kinoposik.ui.categories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.kinoposik.MovieCategoryAdapter
import com.example.kinoposik.MovieDetailsBottomSheet
import com.example.kinoposik.R
import com.example.kinoposik.databinding.FragmentCategoryBinding
import com.example.kinoposik.domain.model.Movie
import com.example.kinoposik.domain.model.MovieCategory

class CategoryFragment : Fragment() {

    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: MovieCategoryAdapter

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

        val onArrawClick = { category: String ->
            requireActivity().findNavController(R.id.nav_host_fragment_container)
                .navigate(R.id.action_categoryFragment_to_movieFragment)
        }

        adapter = MovieCategoryAdapter(movieCategories, onPosterClick, onArrawClick)

        binding.rvMovieCategories.adapter = adapter
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}