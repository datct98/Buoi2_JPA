package com.example.buoi2_jpa.controller;

import com.example.buoi2_jpa.model.dto.RoleDTO;
import com.example.buoi2_jpa.model.dto.UserDTO;
import com.example.buoi2_jpa.model.entity.Role;
import com.example.buoi2_jpa.model.entity.User;
import com.example.buoi2_jpa.repository.RoleRepository;
import com.example.buoi2_jpa.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/user/all")
    public ResponseEntity<List<UserDTO>> getAllUser(){
        ModelMapper mapper = new ModelMapper();
        List<User> users = userRepository.findAll();
        List<UserDTO> userDTOS = users.stream().map(user -> mapper.map(user, UserDTO.class)).collect(Collectors.toList());
        return ResponseEntity.ok(userDTOS);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/role/all")
    public ResponseEntity<List<RoleDTO>> getAllRole(){

        List<Role> roles = roleRepository.findAll();
        List<RoleDTO> roleDTOS= new ArrayList<>();
        for (Role r: roles) {
            RoleDTO dto = new RoleDTO();
            dto.setId(r.getId());
            dto.setName(r.getName());
            dto.setUsers(r.getUsers());
            roleDTOS.add(dto);
        }
        return ResponseEntity.ok(roleDTOS);
    }
}
