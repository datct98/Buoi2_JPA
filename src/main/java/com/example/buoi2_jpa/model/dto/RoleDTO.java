package com.example.buoi2_jpa.model.dto;

import com.example.buoi2_jpa.model.entity.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.OneToMany;
import java.util.Set;
@Data
public class RoleDTO {
    private int id;
    private String name;
    private Set<User> users;
}
