package com.example.randomgroceryapp.repository

import com.example.randomgroceryapp.api.ApiFake
import com.example.randomgroceryapp.model.ProductResponseItem
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val api: ApiFake
): ProductRepository {
    override suspend fun getHotItems(): List<ProductResponseItem> {
        return api.getHotItems()
    }
}