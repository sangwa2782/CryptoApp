package com.ajayam.cryptoapp.domain.repository

import com.ajayam.cryptoapp.domain.model.ImageModel

interface ImageRepository {

    suspend fun getSearchImage(query:String):List<ImageModel>
}