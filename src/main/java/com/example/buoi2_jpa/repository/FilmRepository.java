package com.example.buoi2_jpa.repository;

import com.example.buoi2_jpa.model.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {
}
