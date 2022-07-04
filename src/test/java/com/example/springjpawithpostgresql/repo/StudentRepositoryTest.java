package com.example.springjpawithpostgresql.repo;

import com.example.springjpawithpostgresql.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {


    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {

        Student student = Student.builder()
                .name("Sanoske Sagara")
                .email("sano.s@outlook.com")
                .age(22)
                .address("Dhaka").build();

        studentRepository.save(student);

    }

}