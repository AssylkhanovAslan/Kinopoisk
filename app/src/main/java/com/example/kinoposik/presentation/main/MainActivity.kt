package com.example.kinoposik.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kinoposik.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: MovieAdapter

    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        adapter = MovieAdapter(::onItemClick)

        viewModel.movieCategories.observe(this) { movieCategories ->
            adapter.submitList(movieCategories)
            adapter.notifyDataSetChanged()
        }

        binding.rvMovie.adapter = adapter


        //Сделать nestedRecyclerView.

        //Элемент фильма должен находится в карточке. Края закруглены, соотношение сторон 16:9.
        //Изображение должно загружаться из интернета с помощью ссылки в модели и растягиваться на всю карточку.
        //Название фильма идет поверх изображения

        //Для загрузки изображений используйте Glide.
        //Небольшая инструкция по Glide: https://github.com/bumptech/glide/

        //*Добавить функционал onClick-а. При нажатии открывать BottomSheet с данным о фильме

    }

    private fun onItemClick(movieId: Int) {
        MovieDetailsBottomSheet(movieId).show(supportFragmentManager, null)
    }
}