package com.example.buoi2_jpa.repository;

import com.example.buoi2_jpa.model.entity.CCCD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CccdRepository extends JpaRepository<CCCD, Integer> {
}
