package com.wellington.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
