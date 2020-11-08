package com.example.fruitlister.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fruitlister.data.entities.Fruit
import com.example.fruitlister.data.remote.FruitApi
import kotlinx.coroutines.launch

class FruitSharedViewModel : ViewModel() {

    private val fruits: MutableLiveData<List<Fruit>> by lazy {
        MutableLiveData<List<Fruit>>().also {
            loadFruits()
        }
    }

    private val selected = MutableLiveData<Fruit>()

    fun getFruits(): LiveData<List<Fruit>> {
        return fruits
    }

    fun select(item: Fruit) {
        selected.value = item
    }

    fun getSelected(): LiveData<Fruit> {
        return selected
    }

    private fun loadFruits() {
        viewModelScope.launch {
            try {
                val response = FruitApi.retrofitService.getFruits()

                if (!response.isSuccessful) {
                    throw Exception(response.code().toString() + " " + response.message())
                }

                fruits.value = response.body()
            } catch (e: Exception) {
                Log.d("MainActivity", "Retrofit exception")
                Log.d("MainActivity", e.toString())
            }
        }

        /*
        val handler = Handler()
        handler.post {
            val items: MutableList<Fruit> = ArrayList()
            items.add(Fruit(
                genus = "Malus",
                name = "Apple",
                id = 6,
                family = "Rosaceae",
                order = "Rosales",
                nutritions = Nutrition(
                    hashMapOf(
                        "carbohydrates" to 11.4f,
                        "protein" to 0.3f,
                        "fat" to 0.4f,
                        "calories" to 52f,
                        "sugar" to 10.3f
                    )
                )
            ))

            fruits.value = items
        }
         */
    }

}
