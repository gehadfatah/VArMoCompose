package com.goda.pmovie.data.repository.cachedatasource

import com.goda.pmovie.data.models.app.Article
import com.goda.pmovie.common.data.Resource

interface CacheDataSource {
    fun getArticlesFromCache() : Resource<List<Article>>
    fun saveArticlesToCache(articles: Resource<List<Article>>)
}
