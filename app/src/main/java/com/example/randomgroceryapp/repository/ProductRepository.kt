package com.example.randomgroceryapp.repository

import com.example.randomgroceryapp.model.ProductResponseItem

interface ProductRepository {
    suspend fun getHotItems(): List<ProductResponseItem>
}