package com.example.kinoposik.api

import com.example.kinoposik.models.Movie
import com.example.kinoposik.models.MovieCategory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
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

    fun getMovies(
        category: String,
        onSuccess: (movies: List<Movie>) -> Unit,
        onError: () -> Unit
    ) {
        api.getMovies(category = category)
            .enqueue(object : Callback<MovieCategory> {
                override fun onResponse(
                    call: Call<MovieCategory>,
                    response: Response<MovieCategory>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) onSuccess(responseBody.movies) else onError()
                    } else onError()
                }

                override fun onFailure(call: Call<MovieCategory>, t: Throwable) = onError()
            })
    }
}