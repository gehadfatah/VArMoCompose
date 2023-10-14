package com.goda.pmovie.domain.usecases

import com.goda.pmovie.domain.MovieRepository
import javax.inject.Inject

class UpdateMoviesUseCase @Inject constructor(
    private val repository: MovieRepository,
    private val mapper: ArticleDomainToUiMapper
    ) {
    suspend operator fun invoke()  = mapper.mapFromEntity(repository.updateMovies())
}