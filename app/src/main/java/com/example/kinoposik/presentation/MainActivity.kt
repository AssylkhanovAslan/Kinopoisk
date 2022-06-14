package com.example.kinoposik.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.R
import com.example.kinoposik.adapters.MovieCategoryAdapter
import com.example.kinoposik.repository.MoviesDatabase
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Сделать nestedRecyclerView.

        // Элемент фильма должен находится в карточке. Края закруглены, соотношение сторон 16:9.
        // Изображение должно загружаться из интернета с помощью ссылки в модели и растягиваться на всю карточку.
        // Название фильма идет поверх изображения

        // Для загрузки изображений используйте Glide.
        // Небольшая инструкция по Glide: https://github.com/bumptech/glide/

        // *Добавить функционал onClick-а. При нажатии открывать BottomSheet с данным о фильме

        val rvMovieCategories = findViewById<RecyclerView>(R.id.rv_movie_categories)
        val layoutManager = LinearLayoutManager(this)
        val movieCategoryAdapter = MovieCategoryAdapter(this)
        movieCategoryAdapter.submitList(MoviesDatabase.categoriesList)
        rvMovieCategories.adapter = movieCategoryAdapter
        rvMovieCategories.layoutManager = layoutManager
    }

}