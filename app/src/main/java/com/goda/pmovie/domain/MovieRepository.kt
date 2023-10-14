package com.goda.pmovie.domain

import com.goda.pmovie.data.models.app.Article
import com.goda.pmovie.common.data.Resource


interface MovieRepository {
    suspend fun getMovies() : Resource<List<Article>>
    suspend fun updateMovies(): Resource<List<Article>>
}