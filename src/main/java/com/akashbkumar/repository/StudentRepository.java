package com.akashbkumar.repository;

import com.akashbkumar.entity.Student;

import java.util.UUID;

public interface StudentRepository
{
    void saveStudent(Student student);

    Student findStudent(UUID studentId);

    void updateStudent(UUID studentId, String studentName);

    void deleteStudent(UUID studentId);


}
