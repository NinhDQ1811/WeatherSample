package com.example.weathersample.database

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.weathersample.ForeCastType
import java.text.NumberFormat
import java.util.*

@Entity
data class City(
    @PrimaryKey
    @NonNull @ColumnInfo(name = "id")
    val id: Int = 0,
    @NonNull @ColumnInfo(name = "name")
    val cityName: String,
    @NonNull @ColumnInfo(name = "country")
    val country: String
): ForeCastType

