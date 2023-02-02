package com.example.buoi2_jpa;

import com.example.buoi2_jpa.model.entity.CCCD;
import com.example.buoi2_jpa.model.entity.Person;
import com.example.buoi2_jpa.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

    public static void main(String[] args) {
        SpringApplication.run(Buoi2JpaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        CCCD cccd = new CCCD();
        cccd.setCode("H123");
        cccdRepository.save(cccd);

        Person person = new Person();
        person.setName("Hung");
        person.setCccd(cccd);
        personRepository.save(person);

        /*Author author1 = new Author();
        author1.setName("Dat");
        *//*Author author2 = new Author();
        author2.setName("Dat2");*//*
        authorRepository.save(author1);

        Film film1 = new Film();
        film1.setName("f1");
        film1.setAuthor(author1);
        Film film2 = new Film();
        film2.setName("f2");
        film2.setAuthor(author1);
        filmRepository.save(film1);
        filmRepository.save(film2);*/
        //filmRepository.saveAll(Arrays.asList(film1,film2));
    }
}
