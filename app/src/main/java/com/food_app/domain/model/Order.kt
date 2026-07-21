package com.food_app.domain.model

data class Order(
    val id: String,
    val items: List<CartItem>,
    val totalAmount: Double,
    val createdAt: Long
)
