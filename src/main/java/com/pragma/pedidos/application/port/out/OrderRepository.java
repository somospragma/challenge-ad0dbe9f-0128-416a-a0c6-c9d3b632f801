package com.pragma.pedidos.application.port.out;

import com.pragma.pedidos.domain.model.Order;

public interface OrderRepository {
    Order save(Order order);
}