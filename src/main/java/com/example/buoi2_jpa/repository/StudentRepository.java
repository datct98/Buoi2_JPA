package com.example.buoi2_jpa.repository;

import com.example.buoi2_jpa.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByName(String name);

    //@Query(value = "select * from student where name=?1 and subject=?2", nativeQuery = true)
    List<Student> findByNameAndSubject(String name, String subject);
}
