package com.akashbkumar.repository;

import com.akashbkumar.entity.Student;

import java.util.UUID;

public interface StudentRepository
{
    void saveStudent(Student student);

    Student findStudent(int studentId);

    void updateStudent(int studentId, String studentName);

    void deleteStudent(int studentId);


}
