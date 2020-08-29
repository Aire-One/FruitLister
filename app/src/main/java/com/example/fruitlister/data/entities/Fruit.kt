package com.example.fruitlister.data.entities

data class Fruit(
    val genus: String,
    val name: String,
    val id: Int,
    val family: String,
    val order: String,
    val nutritions: Nutrition
)

/*
{
    "genus": "Malus",
    "name": "Apple",
    "id": 6,
    "family": "Rosaceae",
    "order": "Rosales",
    "nutritions": {
        "carbohydrates": 11.4,
        "protein": 0.3,
        "fat": 0.4,
        "calories": 52,
        "sugar": 10.3
    }
}*/