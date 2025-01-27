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

        //Student student = new Student(1, "Akash Kumar B","Chennai","akashbkumar30@gmail.com", Gender.M,90);

        //Student student1 = new Student(2,"Raghul Kumar B","Chennai","ragulcross@gmail.com", Gender.M, 100);

        StudentRepository studentRepository = new StudentRepositoryImplementation();

        studentRepository.updateStudent(1, "Jason Bourne");







    }
}
