package com.example.springjpawithpostgresql.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "Student")
@Table(
        name = "student",
        uniqueConstraints = {
                @UniqueConstraint(name = "student_unique_email", columnNames = "email")
        }
)
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            initialValue = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "name",
            columnDefinition = "Text",
            nullable = false
    )
    private String name;

    @Column(
            name = "address",
            columnDefinition = "Text",
            nullable = false
    )
    private String address;

    @Column(
            name = "age",
            columnDefinition = "int",
            nullable = false
    )
    private int age;


    @Column(
            name = "email",
            columnDefinition = "Text"
    )
    private String email;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
