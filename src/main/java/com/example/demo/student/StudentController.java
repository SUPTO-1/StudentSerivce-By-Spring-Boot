package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController // Tells spring that is handle http request->Like:get,request also it converts data into json format
@RequestMapping(path = "api/v1/student") // set url for all kind of request
public class StudentController {
    private final StudentService studentService;//The final keyword in Java is used to indicate that a variable, method, or class cannot be changed after it is assigned or defined.
    @Autowired //Please provide the object I need here. Automatically creates and gives you an object of StudentService.
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
