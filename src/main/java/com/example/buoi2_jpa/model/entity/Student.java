package com.example.buoi2_jpa.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float score;
    private String name;
    private String subject;
    @Column(name = "birth_date")
    private Date birthDate;
}
