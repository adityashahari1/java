package com.adityaJP.classAndObjects;

//There are three ways to initialize objects
//By reference variable
//By method
//By constructor

public class InitializeByReferenceVariable {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.id = 14;
        s2.id = 1;
        s1.name = "Ramesh";
        s2.name = "Aditya";

        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}

class Student {
    int id;
    String name;
}

