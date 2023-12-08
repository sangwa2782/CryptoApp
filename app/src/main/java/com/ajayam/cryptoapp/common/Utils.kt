package com.ajayam.cryptoapp.common

import com.ajayam.cryptoapp.data.model.coinDTOItem
import com.ajayam.cryptoapp.domain.model.ImageModel

fun coinDTOItem.toDomainModel(): ImageModel {
    return ImageModel(
        imageUrl = this.image,
        name = this.name,
        symbol = this.symbol,
        current_price = this.current_price
    )
}