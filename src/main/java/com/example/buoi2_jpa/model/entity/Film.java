package com.example.buoi2_jpa.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
public class Film implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne()
    @JoinColumn(name = "author_id")
    @JsonBackReference
    private Author author;
    @JsonManagedReference
    @ManyToMany
    @JoinTable(name = "film_category", joinColumns = @JoinColumn(name = "film_id")
            , inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories;
}
