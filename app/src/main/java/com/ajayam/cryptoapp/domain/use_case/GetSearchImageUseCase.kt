package com.ajayam.cryptoapp.domain.use_case

import com.ajayam.cryptoapp.common.Resource
import com.ajayam.cryptoapp.domain.model.ImageModel
import com.ajayam.cryptoapp.domain.repository.ImageRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception

class GetSearchImageUseCase(private val imageRepository: ImageRepository) {

    operator fun invoke(query: String): Flow<Resource<List<ImageModel>>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = imageRepository.getSearchImage(query = query)))
        } catch (e: Exception) {
            emit(Resource.Error(message = e.message.toString()))
        }
    }

}