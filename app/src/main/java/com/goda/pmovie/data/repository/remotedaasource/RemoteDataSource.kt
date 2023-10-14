package com.goda.pmovie.data.repository.remotedaasource

import com.goda.pmovie.data.models.app.Article
import com.goda.pmovie.common.data.Resource

interface RemoteDataSource {
    suspend fun getNewsDataFromApi() : Resource<List<Article>>
}