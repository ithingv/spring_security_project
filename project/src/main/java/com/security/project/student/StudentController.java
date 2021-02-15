package com.security.project.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1L, "KIM"),
            new Student(2L, "LEE"),
            new Student(3L, "PARK")
    );

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Long studentId){
        return STUDENTS.stream()
                .filter(student -> studentId.equals(student.getStudentId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(
                        "학생 " + studentId + "은 존재하지 않는다."
                ));
    }
}
