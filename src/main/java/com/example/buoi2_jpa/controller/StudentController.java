package com.example.buoi2_jpa.controller;

import com.example.buoi2_jpa.model.entity.Student;
import com.example.buoi2_jpa.model.request.StudentDTO;
import com.example.buoi2_jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/student")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping(value = "/get-by-name")
    public ResponseEntity<List<Student>> getStudentByName(@RequestParam String name){
        return ResponseEntity.ok(studentRepository.findByName(name));
    }

    @PostMapping(value = "/student/insert")
    public ResponseEntity<String> insertStudent(@RequestBody StudentDTO studentDTO){
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setScore(studentDTO.getScore());
        student.setSubject(studentDTO.getSubject());
        studentRepository.save(student);
        return ResponseEntity.ok("Insert successfully");
    }

    @PostMapping(value = "/student/update")
    public ResponseEntity<String> updateStudent(@RequestBody StudentDTO studentDTO){
        Student student = studentRepository.findById(1).get();

        student.setName(studentDTO.getName());
        student.setScore(studentDTO.getScore());
        student.setSubject(studentDTO.getSubject());
        studentRepository.save(student);
        return ResponseEntity.ok("Update successfully");
    }

    @DeleteMapping(value = "/student/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id){
        Student student = studentRepository.findById(id).get();
        studentRepository.delete(student);
        return ResponseEntity.ok("Delete successfully");
    }

    @GetMapping(value = "/student/find")
    public ResponseEntity<List<Student>> findByCondition(@RequestParam String name, @RequestParam String subject){
        List<Student> students = studentRepository.findByNameAndSubject(name, subject);
        return ResponseEntity.ok(students);
    }


}
