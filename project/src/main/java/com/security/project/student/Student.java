package com.security.project.student;

import lombok.Getter;

@Getter
public class Student {
    private final Long studentId;
    private final String studentName;


    public Student(Long studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}

