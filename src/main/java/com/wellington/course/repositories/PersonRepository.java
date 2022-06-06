package com.wellington.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.course.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
