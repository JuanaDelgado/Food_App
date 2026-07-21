package com.food_app.domain.repository

import com.food_app.domain.model.User

interface AuthRepository {
    suspend fun login(email: String, pass: String): Result<User>
    suspend fun getCurrentUser(): User?
    suspend fun logout()
}