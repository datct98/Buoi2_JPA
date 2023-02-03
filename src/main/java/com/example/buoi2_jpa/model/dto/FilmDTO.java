package com.example.buoi2_jpa.model.dto;

import com.example.buoi2_jpa.model.entity.Author;
import com.example.buoi2_jpa.model.entity.Film;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

@Data
public class FilmDTO {
    private int id;
    private String name;
    private Author author;

}
