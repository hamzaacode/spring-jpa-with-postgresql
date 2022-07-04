package com.example.springjpawithpostgresql.model;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Student")
@Table(
        name = "student",
        uniqueConstraints = {
                @UniqueConstraint(name = "student_unique_email", columnNames = "email")
        }
)
@Data
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


    public Student() {
    }

    public Student(String name, String email, String address, int age) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
