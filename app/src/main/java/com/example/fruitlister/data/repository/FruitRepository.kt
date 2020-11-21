package com.example.fruitlister.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.fruitlister.data.entities.Fruit
import com.example.fruitlister.data.remote.FruityviceService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class FruitRepository @Inject constructor(
    private val fruityviceService: FruityviceService
) {

    fun getFruits(): LiveData<List<Fruit>> {
        val data = MutableLiveData<List<Fruit>>()

        fruityviceService.getFruits().enqueue(object : Callback<List<Fruit>> {
            override fun onResponse(call: Call<List<Fruit>>, response: Response<List<Fruit>>) {
                if (response.isSuccessful) {
                    data.value = response.body()
                } else {
                    Log.d("MainActivity", "Repository error on retrofit response")
                    Log.d("MainActivity", response.code().toString())
                    Log.d("MainActivity", response.errorBody().toString())
                    Log.d("MainActivity", response.message())
                }
            }

            override fun onFailure(call: Call<List<Fruit>>, t: Throwable) {
                Log.d("MainActivity", "repository error on retrofit network")
                Log.e("FruitRepository", t.message.toString())
            }
        })

        return data
    }

}
