package com.example.demo.entity;

import jakarta.presistence.Entity;

@Entity
public class StudentEntity{

       @Id
       
       private Listong id;
       private String name;
       private String email;
       private float cgpa;


}
