package com.example.buoi2_jpa.repository;

import com.example.buoi2_jpa.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
