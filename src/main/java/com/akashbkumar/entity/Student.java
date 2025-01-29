package com.akashbkumar.entity;

import com.akashbkumar.enums.Gender;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "student")
public class Student
{
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private UUID id;

    @Column(nullable = false)
    private int marks;

    @Column(nullable = false)
    private String name, city;

    @Column(unique = true)
    private String email;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    public Student(){}

    public Student(String name, String city, String email, Gender gender, int marks)
    {
        this.name = name;
        this.city = city;
        this.email = email;
        this.gender = gender;
        this.marks = marks;
    }

    public UUID getId()
    {
        return id;
    }


    public int getMarks()
    {
        return marks;
    }

    public void setMarks(int marks)
    {
        this.marks = marks;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public Gender getGender()
    {
        return gender;
    }

    public void setGender(Gender gender)
    {
        this.gender = gender;
    }

    @Override
    public String toString()
    {
        String string = String.format("%d %s %s",getId(),getName(), getCity());
        return string;
    }
}
