package com.example.randomgroceryapp.utils

import com.example.randomgroceryapp.model.ProductResponseItem

object FakeData {
    fun get() = listOf(
        ProductResponseItem(
            "1234567890",
            "Organic Chicken",
            "Freshly sourced organic chicken breast. Perfect for a healthy meal.",
            12.99,
            "https://images.unsplash.com/photo-1604503468506-a8da13d82791?q=80&w=200&auto=format&fit=crop",
            "Meat"
        ),
        ProductResponseItem(
            "2345678901",
            "Chef's Knife",
            "High-quality stainless steel knife, specialized for precise cutting.",
            45.50,
            "https://images.unsplash.com/photo-1593612196839-daff6346597a?q=80&w=200&auto=format&fit=crop",
            "Kitchenware"
        ),
        ProductResponseItem(
            "3456789012",
            "Bamboo Chopping Board",
            "Durable and eco-friendly bamboo board. Easy on your knives.",
            25.00,
            "https://images.unsplash.com/photo-1584269600464-37b1b58a9fe7?q=80&w=200&auto=format&fit=crop",
            "Kitchenware"
        ),
        ProductResponseItem(
            "4567890123",
            "Eco-friendly Sponge",
            "Biodegradable sponges that wipe every surface clean without scratches.",
            4.99,
            "https://images.unsplash.com/photo-1584622650111-993a426fbf0a?q=80&w=200&auto=format&fit=crop",
            "Cleaning"
        ),
        ProductResponseItem(
            "5678901234",
            "Fresh Spinach",
            "Garden-fresh spinach leaves, packed with nutrients.",
            3.49,
            "https://images.unsplash.com/photo-1576045057995-568f588f82fb?q=80&w=200&auto=format&fit=crop",
            "Produce"
        ),
        ProductResponseItem(
            "6789012345",
            "Greek Yogurt",
            "Creamy and rich in protein. Great for breakfast or snacks.",
            5.25,
            "https://images.unsplash.com/photo-1488477181946-6428a0291777?q=80&w=200&auto=format&fit=crop",
            "Dairy"
        )
    )

    fun getCategories() = listOf("Produce", "Meat", "Dairy", "Bakery", "Frozen", "Kitchenware", "Cleaning")

    fun getFeatured() = get().shuffled().take(3)
}
