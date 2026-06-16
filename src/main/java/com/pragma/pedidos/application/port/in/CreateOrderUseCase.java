package com.pragma.pedidos.application.port.in;

import com.pragma.pedidos.domain.model.Order;

public interface CreateOrderUseCase {
    Order createOrder(String customerName, String productName, int quantity, double price);
}