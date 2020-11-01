package com.example.fruitlister.ui.viewmodel

import android.os.Handler
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fruitlister.data.entities.Fruit
import com.example.fruitlister.data.entities.Nutrition
import java.util.*

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
    }

}
