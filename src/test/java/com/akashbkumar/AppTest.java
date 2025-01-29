package com.akashbkumar;

import com.akashbkumar.entity.Student;


import com.akashbkumar.enums.Gender;
import com.akashbkumar.repository.StudentRepository;
import com.akashbkumar.repository_implementation.StudentRepositoryImplementation;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.UUID;


public class AppTest
{
    public static void main(String[] args)
    {

        //Student student = new Student("Akash Kumar B","Chennai","akashbkumar30@gmail.com", Gender.M,90);


        StudentRepository studentRepository = new StudentRepositoryImplementation();

        // Save the Student
        //studentRepository.saveStudent(student1);

        // Read Student data



        // Update Student
        //studentRepository.updateStudent(1, "Jason Bourne");







    }
}
