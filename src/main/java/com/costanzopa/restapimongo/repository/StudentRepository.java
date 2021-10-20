package com.costanzopa.restapimongo.repository;

import com.costanzopa.restapimongo.model.Student;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
  Optional<Student> findStudentByEmail(String email);
}
