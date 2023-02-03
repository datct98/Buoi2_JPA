package com.example.buoi2_jpa;

import com.example.buoi2_jpa.model.entity.*;
import com.example.buoi2_jpa.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Set;

@SpringBootApplication
public class Buoi2JpaApplication implements CommandLineRunner{
    @Autowired
    MissQueenRepository missQueenRepository;
    @Autowired
    CrownRepository crownRepository;

    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    FilmRepository filmRepository;
    @Autowired
    private CccdRepository cccdRepository;
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    public static void main(String[] args) {
        SpringApplication.run(Buoi2JpaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        /*Category category = new Category();
        category.setName("c1");
        Category category2 = new Category();
        category2.setName("c2");
        categoryRepository.saveAll(Arrays.asList(category, category2));

        Author author = new Author();
        author.setName("Tran Thanh");
        Film film = new Film();
        film.setName("bo gia");
        film.setAuthor(author);
        film.setCategories(Set.of(category, category2));
        Film film2 = new Film();
        film2.setName("Ba Nu");
        film2.setAuthor(author);
        film2.setCategories(Set.of(category, category2));
        authorRepository.save(author);
        filmRepository.saveAll(Arrays.asList(film, film2));*/


        /*Author author1 = new Author();
        author1.setName("Dat");
        Author author2 = new Author();
        author2.setName("Dat2");
        authorRepository.save(author1);

        Film film1 = new Film();
        film1.setName("f1");
        film1.setAuthor(author1);
        Film film2 = new Film();
        film2.setName("f2");
        film2.setAuthor(author1);
        *//*filmRepository.save(film1);
        filmRepository.save(film2);*//*
        filmRepository.saveAll(Arrays.asList(film1,film2));*/
        /*Role role = new Role();
        role.setName("USER");
        roleRepository.save(role);

        User user1 = new User();
        user1.setUsername("HungNH");
        user1.setPassword("123");
        user1.setRole(role);
        User user2 = new User();
        user2.setUsername("MaleBH");
        user2.setPassword("321");
        user2.setRole(role);
        userRepository.saveAll(Arrays.asList(user1, user2));*/
    }
}
