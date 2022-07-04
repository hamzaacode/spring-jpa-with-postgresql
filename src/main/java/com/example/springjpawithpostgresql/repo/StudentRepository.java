package com.example.springjpawithpostgresql.repo;

import com.example.springjpawithpostgresql.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {


}
