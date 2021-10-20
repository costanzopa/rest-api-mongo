package com.costanzopa.restapimongo.controller;

import com.costanzopa.restapimongo.model.Student;
import com.costanzopa.restapimongo.service.StudentService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<Student> getAll() {
      return  studentService.getAllStudents();
    }
}
