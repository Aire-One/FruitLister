package com.example.fruitlister.ui.viewmodel

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.fruitlister.data.entities.Fruit
import com.example.fruitlister.data.repository.FruitRepository

class FruitSharedViewModel @ViewModelInject constructor(
    repository: FruitRepository,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val fruits = repository.getFruits()

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

}
