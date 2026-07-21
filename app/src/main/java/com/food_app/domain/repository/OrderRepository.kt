package com.food_app.domain.repository

import com.food_app.domain.model.CartItem
import com.food_app.domain.model.Order

interface OrderRepository {
    //Recibe lista de productos que el usuario tiene en el carrito y devuelve una orden
    suspend fun placeOrder(items: List<CartItem>): Result<Order>
    //Trae el historial de ordenes que realizo el usuario
    suspend fun getOrderHistory(): Result<List<Order>>
}