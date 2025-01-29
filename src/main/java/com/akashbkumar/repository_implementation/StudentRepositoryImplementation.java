package com.akashbkumar.repository_implementation;

import com.akashbkumar.config.DatabaseConfig;
import com.akashbkumar.entity.Student;
import com.akashbkumar.repository.StudentRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.xml.crypto.Data;
import java.util.UUID;

public class StudentRepositoryImplementation implements StudentRepository
{

    static SessionFactory sessionFactory = DatabaseConfig.getSessionFactory();
    @Override
    public void saveStudent(Student student)
    {
        try(Session session = sessionFactory.openSession())
        {
            Transaction transaction = session.beginTransaction();

            // logic to save the object into the database.
            session.persist(student);

            transaction.commit();
        }
    }

    @Override
    public Student findStudent(int studentId)
    {
        try (Session session = sessionFactory.openSession())
        {
            return session.get(Student.class,studentId);
        }
    }

    @Override
    public void updateStudent(int studentId, String studentName)
    {
        try(Session session = sessionFactory.openSession())
        {
            Transaction transaction = session.beginTransaction();
            Student student = session.get(Student.class,studentId);
            student.setName(studentName);
            session.merge(student);
            transaction.commit();
        }
    }

    @Override
    public void deleteStudent(int studentId) {
        try (Session session = sessionFactory.openSession())
        {
            Transaction transaction = session.beginTransaction();
            Student student = session.get(Student.class,studentId);
            session.remove(student);
            transaction.commit();
        }
    }
}
