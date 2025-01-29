package com.akashbkumar;

import com.akashbkumar.entity.Student;


import com.akashbkumar.enums.Gender;
import com.akashbkumar.repository.StudentRepository;
import com.akashbkumar.repository_implementation.StudentRepositoryImplementation;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class AppTest

{
    public static void main(String[] args)
    {

        //Student student = new Student("Thomas Shelby","Birmingham","thomasShebly@gmail.com", Gender.M,100);

        Student student1 = new Student("Ragul Kumar B","Chennai","ragulcross@gmail.com", Gender.M, 100);

        StudentRepository studentRepository = new StudentRepositoryImplementation();



        // Creating the student
        //studentRepository.saveStudent(student1);
        studentRepository.saveStudent(student1);

        // Updating the Student
        // studentRepository.updateStudent(1, "Jason Bourne");

        // Deleting the student.
        //studentRepository.deleteStudent(2);

    }
}
