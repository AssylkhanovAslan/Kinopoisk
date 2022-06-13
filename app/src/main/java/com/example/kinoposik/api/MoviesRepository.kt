package com.example.kinoposik.api

import android.util.Log
import com.example.kinoposik.models.MovieCategory
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

object MoviesRepository {

    private val api: Api

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(Api::class.java)
    }

    fun getPopularMovies(page: Int = 1) {
        api.getPopularMovies(page = page)
            .enqueue(object : Callback<MovieCategory> {
                override fun onResponse(
                    call: Call<MovieCategory>,
                    response: Response<MovieCategory>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()

                        if (responseBody != null) {
                            Log.d("Repository", "Movies: ${responseBody.movies}")
                        } else {
                            Log.d("Repository", "Failed to get response")
                        }
                    }
                }

                override fun onFailure(call: Call<MovieCategory>, t: Throwable) {
                    Log.e("Repository", "onFailure", t)
                }
            })
    }
}