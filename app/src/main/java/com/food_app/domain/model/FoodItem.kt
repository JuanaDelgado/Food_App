package com.food_app.domain.model

data class FoodItem(
    val id: String,
    val name: String,
    val description: String,
    val price: Double,
    val categoryId: String,
    val imageUrl: String
)
