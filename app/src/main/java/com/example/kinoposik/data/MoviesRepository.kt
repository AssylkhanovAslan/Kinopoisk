package com.example.kinoposik.data

import com.example.kinoposik.data.network.MovieService
import com.example.kinoposik.domain.models.Movie
import com.example.kinoposik.domain.models.MovieCategory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MoviesRepository(private val retrofit: Retrofit) {

    private val service = retrofit.create(MovieService::class.java)

    fun getMovies(
        category: String,
        onSuccess: (movies: List<Movie>) -> Unit,
        onError: () -> Unit
    ) {
        service.getMovies(category = category)
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

    fun getMovie(
        id: Int,
        onSuccess: (movie: Movie) -> Unit,
        onError: () -> Unit
    ) {
        service.getMovie(id = id)
            .enqueue(object  : Callback<Movie> {
                override fun onResponse(call: Call<Movie>, response: Response<Movie>) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) onSuccess(responseBody) else onError()
                    } else onError()
                }

                override fun onFailure(call: Call<Movie>, t: Throwable) = onError()
            })
    }
}