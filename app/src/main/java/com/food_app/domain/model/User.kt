package com.food_app.domain.model

data class User(
    val id: String,
    val email: String,
    val name: String,
    val token: String? = null
)
