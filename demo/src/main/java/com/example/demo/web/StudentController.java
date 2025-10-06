package com.example.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    private final Logger LOGGER =
            LoggerFactory.getLogger(StudentController.class);

    @GetMapping
    public ResponseEntity<List<String>> getAllStudents() {
        //List<Student> studentList = studentService.getAllStudents();

        List<String> studentList = List.of("Student 1","Student 2","Student 3");
        return ResponseEntity.ok(studentList);
    }

}