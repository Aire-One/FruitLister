package com.example.fruitlister.ui.viewmodel

import android.os.Handler
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fruitlister.data.entities.Fruit
import com.example.fruitlister.dummy.DummyContent

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
            fruits.value = DummyContent.ITEMS
        }
    }

}
