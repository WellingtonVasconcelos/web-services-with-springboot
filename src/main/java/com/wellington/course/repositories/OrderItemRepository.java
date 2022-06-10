package com.wellington.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
