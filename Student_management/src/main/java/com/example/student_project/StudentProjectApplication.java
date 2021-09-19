package com.example.student_project;

import com.example.student_project.entity.Student;
import com.example.student_project.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentProjectApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentProjectApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {

    }
}
