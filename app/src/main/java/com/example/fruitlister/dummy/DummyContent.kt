package com.example.fruitlister.dummy

import com.example.fruitlister.data.entities.Fruit
import com.example.fruitlister.data.entities.Nutrition
import java.util.*

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<Fruit> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<Int, Fruit> = HashMap()

    init {
        // Add some sample items.
        addItem(createDummyItem())
    }

    private fun addItem(item: Fruit) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(): Fruit {
        return Fruit(
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
        )
    }
}