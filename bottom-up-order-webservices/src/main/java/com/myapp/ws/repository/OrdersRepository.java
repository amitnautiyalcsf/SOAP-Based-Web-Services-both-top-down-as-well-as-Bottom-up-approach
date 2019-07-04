package com.myapp.ws.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.ws.model.Order;

public interface OrdersRepository extends JpaRepository< Order, Integer>{
    List<Order> findByProductName(String productName);
}
