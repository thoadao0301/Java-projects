package com.example.student_project.services;

import com.example.student_project.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentByID(long id);
    Student updateStudent(Student student);
    void deleteStudentById(long id);
}
