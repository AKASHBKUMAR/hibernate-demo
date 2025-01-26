package com.akashbkumar;

import com.akashbkumar.enums.Gender;


import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


import java.util.Properties;

/**
 * Unit test for simple App.
 */
public class AppTest

{
    public static void main(String[] args)
    {
        try
        {
            Configuration configuration = new Configuration()
                    .addAnnotatedClass(Student.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            configuration.buildSessionFactory(serviceRegistry);



        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
