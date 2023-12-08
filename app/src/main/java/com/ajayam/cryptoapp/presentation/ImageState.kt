package com.ajayam.cryptoapp.presentation

import com.ajayam.cryptoapp.domain.model.ImageModel

data class ImageState(
    val isLoading:Boolean=false,
    val data:List<ImageModel>?=null,
    val error:String=""
)
