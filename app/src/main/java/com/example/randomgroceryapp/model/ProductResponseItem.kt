package com.example.randomgroceryapp.model

data class ProductResponseItem(
    val id: String,
    val name: String,
    val description: String,
    val unitPrice: Double,
    val imageUrl: String = "https://via.placeholder.com/150",
    val category: String = "General"
)
