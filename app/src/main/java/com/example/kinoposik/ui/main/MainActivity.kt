package com.example.kinoposik.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kinoposik.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}


//Сделать nestedRecyclerView.

//Элемент фильма должен находится в карточке. Края закруглены, соотношение сторон 16:9.
//Изображение должно загружаться из интернета с помощью ссылки в модели и растягиваться на всю карточку.
//Название фильма идет поверх изображения

//Для загрузки изображений используйте Glide.
//Небольшая инструкция по Glide: https://github.com/bumptech/glide/

//*Добавить функционал onClick-а. При нажатии открывать BottomSheet с данным о фильме