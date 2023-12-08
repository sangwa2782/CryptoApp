package com.ajayam.cryptoapp.data.network

import com.ajayam.cryptoapp.data.model.coinDTO
import retrofit2.http.GET
import retrofit2.http.Query

const val BASE_URL = "https://api.coingecko.com/"

interface ApiService {

    //https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&page=1&sparkline=false

    @GET("api/v3/coins/markets")
    suspend fun getSearchImage(
        @Query("vs_currency") vs_currency: String="usd",
        @Query("order") order: String="market_cap_desc",
        @Query("page") page: Number=1,
        @Query("sparkline") sparkline: Boolean=false
    ): coinDTO

}