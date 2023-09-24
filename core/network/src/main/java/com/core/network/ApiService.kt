package com.core.network

import com.core.network.model.MovieListResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    //https://api.themoviedb.org/3/search/movie?api_key=f0a750f44b2adc4d7d523365741cc119&query=Harry
    @GET("3/search/movie")
    suspend fun getMovieList(
        @Query("api_key") apiKey:String,
        @Query("query") q:String
    ):MovieListResponse
}