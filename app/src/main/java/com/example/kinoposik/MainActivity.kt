package com.example.kinoposik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recyclerView = findViewById<RecyclerView>(R.id.categories_recycler_view)
        val movieCategoryAdapter = MovieCategoryAdapter(this)
        val movieCategoryManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerView.adapter = movieCategoryAdapter
        recyclerView.layoutManager = movieCategoryManager

        movieCategoryAdapter.setItems(list)
    }
}