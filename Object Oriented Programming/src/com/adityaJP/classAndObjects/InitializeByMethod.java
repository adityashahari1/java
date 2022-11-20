package com.adityaJP.classAndObjects;


//There are three ways to initialize objects
//By reference variable
//By method
//By constructor

public class InitializeByMethod {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();

        s1.insert(45, "aditya");
        s2.insert(5, "ramesh");
        s1.display();
        s2.display();
    }
}

class Student1 {
    int id;
    String name;

    void insert(int r, String n) {
        id = r;
        name = n;
    }

    void display() {
        System.out.println(id +" "+ name);
    }
}
