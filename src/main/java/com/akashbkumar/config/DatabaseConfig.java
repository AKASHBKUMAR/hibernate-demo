package com.akashbkumar.config;

import com.akashbkumar.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DatabaseConfig
{
    private static final SessionFactory SESSION_FACTORY = DatabaseConfig.buildSessionFactory();

    private DatabaseConfig(){}

    private static SessionFactory buildSessionFactory()
    {
        Configuration configuration = new Configuration().addAnnotatedClass(Student.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        return sessionFactory;
    }

    public static SessionFactory getSessionFactory()
    {
        return SESSION_FACTORY;
    }
}
