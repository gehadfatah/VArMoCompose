package com.goda.pmovie.data.repository.cachedatasource

import com.google.common.truth.Truth.assertThat
import com.goda.pmovie.common.data.Resource
import com.goda.pmovie.data.models.app.Article
import org.junit.Test


class CacheDataSourceImplTest {

    private val SUT = CacheDataSourceImpl()

    @Test
    fun saveArticles_successResource_getTheSameList () {
        val articles: Resource<List<Article>> = Resource.success(emptyList())
        SUT.saveArticlesToCache(articles)
        assertThat(SUT.getArticlesFromCache()).isEqualTo(articles)
    }

    @Test
    fun saveArticles_errorResource_getTheSameList () {
        val articles: Resource<List<Article>>  = Resource.error("", emptyList())
        SUT.saveArticlesToCache(articles)
        assertThat(SUT.getArticlesFromCache()).isEqualTo(articles)
    }

}