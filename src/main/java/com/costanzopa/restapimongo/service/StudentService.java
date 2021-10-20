package com.costanzopa.restapimongo.service;

import com.costanzopa.restapimongo.model.Student;
import com.costanzopa.restapimongo.repository.StudentRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {

  private final StudentRepository studentRepository;

  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }
}
