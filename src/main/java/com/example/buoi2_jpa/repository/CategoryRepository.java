package com.example.buoi2_jpa.repository;

import com.example.buoi2_jpa.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
