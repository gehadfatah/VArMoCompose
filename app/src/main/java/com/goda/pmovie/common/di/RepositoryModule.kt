package com.goda.pmovie.common.di

import com.goda.topmovies.common.utils.NetworkHelper
import com.goda.pmovie.data.api.MoviesApiService
import com.goda.pmovie.data.mappers.ApiDataToArticleMapper
import com.goda.pmovie.data.repository.RepositoryImpl
import com.goda.pmovie.data.repository.cachedatasource.CacheDataSource
import com.goda.pmovie.data.repository.cachedatasource.CacheDataSourceImpl
import com.goda.pmovie.domain.MovieRepository
import com.goda.pmovie.data.repository.remotedaasource.RemoteDataSource
import com.goda.pmovie.data.repository.remotedaasource.RemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(
        newsApiService: MoviesApiService,
        networkHelper: NetworkHelper
    ) : RemoteDataSource {
        return RemoteDataSourceImpl(
            apiService = newsApiService,
            mapper = ApiDataToArticleMapper(),
            networkHelper = networkHelper
        )
    }

    @Singleton
    @Provides
    fun provideNewsCacheDataSource() : CacheDataSource {
        return CacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideRepository(
        cacheDataSource: CacheDataSource,
        remoteDataSource: RemoteDataSource,
    ) : MovieRepository {
        return RepositoryImpl(cacheDataSource, remoteDataSource)
    }

}