package com.example.fruitlister.data.entities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Nutrition(
    val nutrition: HashMap<String, Float>
) : Parcelable
