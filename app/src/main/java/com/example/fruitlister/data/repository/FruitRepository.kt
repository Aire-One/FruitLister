package com.example.fruitlister.data.repository

import androidx.lifecycle.LiveData
import com.example.fruitlister.data.entities.Fruit
import com.example.fruitlister.data.local.FruitDao
import com.example.fruitlister.data.remote.FruityviceService
import javax.inject.Inject

class FruitRepository @Inject constructor(
    private val fruityviceService: FruityviceService,
    private val fruitDao: FruitDao
) {

    fun getFruits(): LiveData<List<Fruit>> {
        return  fruitDao.getAllFruits()
    }

    suspend fun refreshFruits() {
        fruityviceService.getFruits().also { fruitDao.insertAllFruits(it) }
    }

}
