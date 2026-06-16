package com.pragma.pedidos.infrastructure.adapter.out;

import com.pragma.pedidos.application.port.out.OrderRepository;
import com.pragma.pedidos.domain.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    @Override
    public Order save(Order order) {
        // Lógica para guardar el pedido en la base de datos
        return order;
    }
}