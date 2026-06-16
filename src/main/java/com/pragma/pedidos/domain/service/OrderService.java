package com.pragma.pedidos.domain.service;

import com.pragma.pedidos.domain.model.Order;

public class OrderService {
    public Order createOrder(String customerName, String productName, int quantity, double price) {
        Order order = new Order(null, customerName, productName, quantity, price);
        // Lógica de negocio para crear un pedido
        return order;
    }
}