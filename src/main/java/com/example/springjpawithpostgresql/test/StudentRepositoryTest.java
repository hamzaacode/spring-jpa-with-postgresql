package com.example.springjpawithpostgresql.test;

import com.example.springjpawithpostgresql.model.Student;
import com.example.springjpawithpostgresql.repo.StudentRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentRepositoryTest {
    @Autowired
    StudentRepository studentRepository;

    @Test
    public void saveStudent(){

        Student student = new Student("Kona", "kona.k@gmail.com", "Dhaka", 22);studentRepository.save(student);

    }
}
