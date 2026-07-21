package com.food_app.domain.repository

import com.food_app.domain.model.Category
import com.food_app.domain.model.FoodItem

interface FoodRepository {
    suspend fun getCategories(): Result<List<Category>>
    suspend fun getFoodItems(): Result<List<FoodItem>>
    //Trae unicamente los platos que pertenecen a una categoria especifica (al usar los filtros)
    suspend fun getFoodItemsByCategory(categoryId: String): Result<List<FoodItem>>
}