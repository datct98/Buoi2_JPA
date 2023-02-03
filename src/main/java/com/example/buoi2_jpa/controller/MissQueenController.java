package com.example.buoi2_jpa.controller;

import com.example.buoi2_jpa.model.dto.FilmDTO;
import com.example.buoi2_jpa.model.entity.Author;
import com.example.buoi2_jpa.model.entity.Category;
import com.example.buoi2_jpa.model.entity.Film;
import com.example.buoi2_jpa.model.entity.MissQueen;
import com.example.buoi2_jpa.repository.AuthorRepository;
import com.example.buoi2_jpa.repository.CategoryRepository;
import com.example.buoi2_jpa.repository.FilmRepository;
import com.example.buoi2_jpa.repository.MissQueenRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MissQueenController {
    @Autowired
    private MissQueenRepository missQueenRepository;

    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping(value = "/queen/all")
    public ResponseEntity<List<MissQueen>> getAllQueen(){
        List<MissQueen> missQueens = missQueenRepository.
                findAllByNameAndHeight(178, "Tien");
        return ResponseEntity.ok(missQueens);
    }
    @GetMapping(value = "/queen/{id}")
    public ResponseEntity<MissQueen> getById(@PathVariable(name = "id") int id){
        return ResponseEntity.ok(missQueenRepository.findById(id).get());
    }

    @GetMapping(value = "/queen")
    public ResponseEntity<List<MissQueen>> findByCondition(@RequestParam(name = "height") int hei,
                                                           @RequestParam(name = "name") String name){
        List<MissQueen> missQueens = missQueenRepository.
                findAllByNameAndHeight(hei, name);
        return ResponseEntity.ok(missQueens);
    }

    @GetMapping(value = "/film/all")
    public ResponseEntity<List<FilmDTO>> getAllFilm(){
        List<Film> films = filmRepository.findAll();
        ModelMapper mapper = new ModelMapper();
        List<FilmDTO> filmDTOS = films.stream().map(film-> mapper.map(film, FilmDTO.class)).collect(Collectors.toList());
        return ResponseEntity.ok(filmDTOS);
    }

    @GetMapping(value = "/author/all")
    public ResponseEntity<List<Author>> getAllAuthor(){
        List<Author> authors = authorRepository.findAll();
        return ResponseEntity.ok(authors);
    }

    @GetMapping(value = "/category/all")
    public ResponseEntity<List<Category>> getAllCategories(){
        List<Category> categories = categoryRepository.findAll();
        return ResponseEntity.ok(categories);
    }
}
