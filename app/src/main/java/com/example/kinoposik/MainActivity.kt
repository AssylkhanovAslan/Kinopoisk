package com.example.kinoposik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.adapters.MovieCategoryAdapter
import com.example.kinoposik.models.MovieLinks
import com.example.kinoposik.viewHolders.VHparent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Сделать nestedRecyclerView.

        //Элемент фильма должен находится в карточке. Края закруглены, соотношение сторон 16:9.
        //Изображение должно загружаться из интернета с помощью ссылки в модели и растягиваться на всю карточку.
        //Название фильма идет поверх изображения

        //Для загрузки изображений используйте Glide.
        //Небольшая инструкция по Glide: https://github.com/bumptech/glide/

        //*Добавить функционал onClick-а. При нажатии открывать BottomSheet с данным о фильме


        val rvMovieCategories = findViewById<RecyclerView>(R.id.parent_recyclerview)
        val layoutManager = LinearLayoutManager(this)
        val movieCategoryAdapter = MovieCategoryAdapter(this)
        movieCategoryAdapter.setItems(MovieLinks.movieCategory)
        rvMovieCategories.adapter = movieCategoryAdapter
        rvMovieCategories.layoutManager = layoutManager

    }
}