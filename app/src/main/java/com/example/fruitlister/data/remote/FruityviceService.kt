package com.example.fruitlister.data.remote

import com.example.fruitlister.data.entities.Fruit
import retrofit2.http.GET
import retrofit2.http.Path

interface FruityviceService {

    @GET("api/fruit/all")
    suspend fun getFruits() : List<Fruit>

    @GET("api/fruit/{id}")
    suspend fun getFruit(@Path("id") id: Int): Fruit


    companion object {
        const val FRUITYVICE_API_URL = "http://192.168.1.85:8000" // "https://www.fruityvice.com/"
    }
}
