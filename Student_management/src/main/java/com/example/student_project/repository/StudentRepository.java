package com.example.student_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.student_project.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
