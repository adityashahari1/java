package com.company.aditya.constructor;

public class Class1 {
    public static void main(String[] args) {
        Student aditya = new Student(23, "Aditya", 56);
        System.out.println(aditya.marks);

        Student rahul = new Student();
        System.out.println(rahul.marks);
        System.out.println(rahul.name);
        System.out.println(rahul.id);

        Student rohit = rahul;
        System.out.println(rohit.name);
        rahul.name = "rahul";
        System.out.println(rohit.name);

    }
}

class Student {
    int id;
    String name;
    float marks;


    Student() {
        //similar to new Student(0, "default person", 100.0f);
        this(0, "default person", 100.0f);
    }

    Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
