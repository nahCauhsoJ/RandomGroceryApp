package com.example.randomgroceryapp.utils

import com.example.randomgroceryapp.model.ProductResponseItem

object FakeData {
    fun get() = listOf(
        ProductResponseItem(
            "1234567890",
            "Chicken",
            "Tasty chicken.",
            6.9
        ),
        ProductResponseItem(
            "2345678901",
            "Knife",
            "Specialized for cutting chicken.",
            3.2
        ),
        ProductResponseItem(
            "3456789012",
            "Metal Chopping Board",
            "Durable against knife cuts.",
            42.0
        ),
        ProductResponseItem(
            "4567890123",
            "Sponge",
            "Wipes every cutting board clean.",
            1.2
        )
    )
}