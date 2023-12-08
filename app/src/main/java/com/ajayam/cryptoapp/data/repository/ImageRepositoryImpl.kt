package com.ajayam.cryptoapp.data.repository

import com.ajayam.cryptoapp.common.toDomainModel
import com.ajayam.cryptoapp.data.network.ApiService
import com.ajayam.cryptoapp.domain.model.ImageModel
import com.ajayam.cryptoapp.domain.repository.ImageRepository

class ImageRepositoryImpl(private val apiService: ApiService) : ImageRepository {

    override suspend fun getSearchImage(query: String): List<ImageModel> {
        try {
            return apiService.getSearchImage(
            ).map { it.toDomainModel() }
        } catch (e: java.lang.Exception) {
            throw Exception(e)
        }
    }
}