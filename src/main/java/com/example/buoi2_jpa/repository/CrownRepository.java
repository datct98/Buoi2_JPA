package com.example.buoi2_jpa.repository;

import com.example.buoi2_jpa.model.entity.Crown;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrownRepository extends JpaRepository<Crown, Integer> {
}
