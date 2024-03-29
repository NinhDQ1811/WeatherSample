package com.example.weathersample.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface CityDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(city: City): Long

    @Query("SELECT * FROM City ")
    fun getItems(): List<City>
}