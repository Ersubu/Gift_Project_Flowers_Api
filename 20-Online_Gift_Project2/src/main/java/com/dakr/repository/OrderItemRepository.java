package com.dakr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dakr.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
