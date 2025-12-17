package com.example.demo.entity;

import jakarta.presistence.Entity;
import jakarta.presistence.GeneratedValue;
import jakarta.presistence.GenerationType;
import jakarta.presistence.Id;

@Entity
public class StudentEntity{

       @Id
       @GeneratedValue(strategy = GeneratedType.IDENTITY)
       private Listong id;
       private String name;
       private String email;
       private float cgpa;
}
