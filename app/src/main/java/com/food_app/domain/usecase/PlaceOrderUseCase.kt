package com.food_app.domain.usecase

import com.food_app.domain.model.CartItem
import com.food_app.domain.model.Order
import com.food_app.domain.repository.OrderRepository

class PlaceOrderUseCase(private val orderRepository: OrderRepository) {
    suspend operator fun invoke(items: List<CartItem>): Result<Order> {
        if (items.isEmpty()) {
            return Result.failure(IllegalArgumentException("El carrito está vacío"))
        }
        return orderRepository.placeOrder(items)
    }
}