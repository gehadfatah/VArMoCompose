package com.goda.pmovie.data.repository.cachedatasource

import com.goda.pmovie.data.models.app.Article
import com.goda.pmovie.common.data.Resource
import com.goda.pmovie.common.data.Status

class CacheDataSourceImpl: CacheDataSource {

    private var articles = Resource(Status.LOADING, emptyList<Article>(), "")

    override fun getArticlesFromCache() = articles

    override fun saveArticlesToCache(articles: Resource<List<Article>>) {
        this.articles = articles
    }
}