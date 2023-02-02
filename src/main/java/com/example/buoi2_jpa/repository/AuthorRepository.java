package com.example.buoi2_jpa.repository;

import com.example.buoi2_jpa.model.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
