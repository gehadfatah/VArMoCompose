package com.goda.pmovie.domain.usecases

import com.goda.pmovie.common.data.EntityMapper
import com.goda.pmovie.common.data.Resource
import com.goda.pmovie.common.data.ResourceInfo
import com.goda.pmovie.data.models.app.Article
import com.goda.pmovie.common.utils.Constants
import com.goda.topmovies.common.utils.ResourceProvider

import javax.inject.Inject

class ArticleDomainToUiMapper @Inject constructor(
   private val  resourceProvider: ResourceProvider
) :
    EntityMapper<Resource<List<Article>>, Resource<List<Article>>> {

    override fun mapFromEntity(data: Resource<List<Article>>): Resource<List<Article>> {
       return if (data.isError()) setErrorMessage(data)
       else data
    }

    private fun setErrorMessage(data: Resource<List<Article>>) : Resource<List<Article>> {
        val errorType = when (data.getInfo()) {
            is ResourceInfo.ConnectionError -> Constants.DataErrors.CONNECTION
            is ResourceInfo.RequestError -> Constants.DataErrors.REQUEST
            is ResourceInfo.ErrorException -> Constants.DataErrors.SERVER
            else -> Constants.DataErrors.GENERIC
        }

        val message = resourceProvider.getErrorMessage(errorType)

        return Resource.error(message, data = data.data).apply {
            setInfo(ResourceInfo.ErrorType(errorType))
        }
    }
}