package com.example.fruitlister.data.repository

class FruitRepository {

    /*private val fruityviceService: FruityviceService

    suspend fun getFruits(): LiveData<List<Fruit>> {
        val data = MutableLiveData<List<Fruit>>()

        fruityviceService.getFruits().enqueue(object : Callback<List<Fruit>> {
            override fun onResponse(call: Call<List<Fruit>>, response: Response<List<Fruit>>) {
                data.value = response.body()
            }

            override fun onFailure(call: Call<List<Fruit>>, t: Throwable) {
                Log.e("FruitRepository", "Error on Fruityvice API call")
                throw t
            }
        })
        return data
    }*/

}
