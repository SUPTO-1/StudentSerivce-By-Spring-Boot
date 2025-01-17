package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Supto",
                        "st@gmail.com",
                        "Brahmanbaria",
                        "Male",
                        LocalDate.of(2000, Month.SEPTEMBER,18),
                        25

                ),
                new Student(
                        2L,
                        "Jahid",
                        "Jahid@gmail.com",
                        "Brahmanbaria",
                        "Male",
                        LocalDate.of(2000,Month.DECEMBER,28),
                        26
                )
        );
    }
}
