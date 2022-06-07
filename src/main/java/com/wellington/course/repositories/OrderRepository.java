package com.wellington.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
