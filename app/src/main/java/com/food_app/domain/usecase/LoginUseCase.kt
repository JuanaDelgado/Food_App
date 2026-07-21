package com.food_app.domain.usecase

import com.food_app.domain.model.User
import com.food_app.domain.repository.AuthRepository

class LoginUseCase (private val repository: AuthRepository) {
    suspend operator fun invoke(email: String, pass: String): Result<User> {
        if(email.isBlank() || pass.isBlank()) {
            return Result.failure((IllegalArgumentException("Campos incompletos")))
        }
        return repository.login(email, pass)
    }
}