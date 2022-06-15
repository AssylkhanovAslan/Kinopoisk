package com.example.kinoposik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kinoposik.bottomsheet.MovieDetailBottomSheet
import com.example.kinoposik.childrecyclerview.OnClick
import com.example.kinoposik.data.LocalData
import com.example.kinoposik.models.Movie
import com.example.kinoposik.parentrecyclerview.ParentItemAdapter
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity(), OnClick {

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

        val recyclerView = findViewById<RecyclerView>(R.id.rv_parent)

        val parentAdapter = ParentItemAdapter(this)
        parentAdapter.setCategoryList(LocalData.getParentItemList())

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = parentAdapter

        /*val onClickObject: OnClick = object : OnClick {
            override fun onImageClick(item: Movie) {

            }
        }
        parentAdapter.attachClick(onClickObject)*/
    }

    override fun onImageClick(item: Movie) {
        val modalBottomSheet = MovieDetailBottomSheet.newInstance(item)
        modalBottomSheet.show(supportFragmentManager, null)
    }

}