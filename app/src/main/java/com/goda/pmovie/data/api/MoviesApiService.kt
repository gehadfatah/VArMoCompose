package com.goda.pmovie.data.api

import com.goda.pmovie.data.models.api.MovieList
import retrofit2.Response
import retrofit2.http.GET

interface MoviesApiService {
    @GET("movie/popular")
    suspend fun getPopularMovies() : Response<MovieList>
}