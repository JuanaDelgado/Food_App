package com.food_app.domain.usecase

import com.food_app.domain.repository.FoodRepository
import com.food_app.domain.model.Category
import com.food_app.domain.model.FoodItem

class GetCatalogUseCase (private val foodRepository: FoodRepository) {
    suspend operator fun invoke(): Result<Pair<List<Category>, List<FoodItem>>> {
        val categories = foodRepository.getCategories().getOrNull() ?: emptyList()
        val foods = foodRepository.getFoodItems().getOrNull() ?: emptyList()
        return Result.success(Pair(categories, foods))
    }
}