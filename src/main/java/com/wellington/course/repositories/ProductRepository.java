package com.wellington.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
