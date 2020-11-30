package com.example.fruitlister.ui.viewmodel

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.example.fruitlister.data.entities.Fruit
import com.example.fruitlister.data.repository.FruitRepository
import kotlinx.coroutines.launch

class FruitSharedViewModel @ViewModelInject constructor(
    private val repository: FruitRepository,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val fruits = repository.getFruits()

    private val selected = MutableLiveData<Fruit>()

    fun getFruits(): LiveData<List<Fruit>> {

        viewModelScope.launch {
            repository.refreshFruits()
        }

        return fruits
    }

    fun select(item: Fruit) {
        selected.value = item
    }

    fun getSelected(): LiveData<Fruit> = selected

}
