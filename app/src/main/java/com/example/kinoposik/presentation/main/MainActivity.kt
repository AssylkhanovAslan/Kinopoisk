package com.example.kinoposik.presentation.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get
import com.example.kinoposik.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewModel.movieCategories.observe(this) { movieCategories ->
            //Здесь сабмитить данные для адаптера
        }

        //Сделать nestedRecyclerView.

        //Элемент фильма должен находится в карточке. Края закруглены, соотношение сторон 16:9.
        //Изображение должно загружаться из интернета с помощью ссылки в модели и растягиваться на всю карточку.
        //Название фильма идет поверх изображения

        //Для загрузки изображений используйте Glide.
        //Небольшая инструкция по Glide: https://github.com/bumptech/glide/

        //*Добавить функционал onClick-а. При нажатии открывать BottomSheet с данным о фильме

    }
}