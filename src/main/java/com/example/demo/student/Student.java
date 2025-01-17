package com.example.demo.student;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private String address;
    private String gender;
    private LocalDate dob;
    private int age;

    public Student() {
    }

    public Student(Long id, String name, String email, String address, String gender, LocalDate dob, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name, String email, String address, String gender, LocalDate dob, int age) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.dob = dob;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
