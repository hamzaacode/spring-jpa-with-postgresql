package com.example.springjpawithpostgresql;

import com.example.springjpawithpostgresql.model.Student;
import com.example.springjpawithpostgresql.repo.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaWithPostgresqlApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringJpaWithPostgresqlApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student student = new Student("Kona", "kona.k@gmail.com", "Dhaka", 22);
            studentRepository.save(student);
        };
    }
}
