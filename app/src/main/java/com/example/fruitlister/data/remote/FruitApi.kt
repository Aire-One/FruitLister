package com.example.fruitlister.data.remote

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

// retrofit instance
private val retrofit = Retrofit.Builder()
    .baseUrl(FruityviceService.FRUITYVICE_API_URL)
    .addConverterFactory(MoshiConverterFactory.create())
    .build()

// API object to expose retrofit service
object FruitApi {
    val retrofitService : FruityviceService by lazy { retrofit.create(FruityviceService::class.java) }
}