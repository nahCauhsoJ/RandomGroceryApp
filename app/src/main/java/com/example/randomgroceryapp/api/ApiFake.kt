package com.example.randomgroceryapp.api

import com.example.randomgroceryapp.utils.FakeData

class ApiFake {
    suspend fun getHotItems() = FakeData.get()
}