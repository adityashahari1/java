package com.aditya;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
//        Student aditya;
//        System.out.println(Arrays.toString(students));

        Student aditya = new Student(84, "Aditya Shahari", 34.4f);
        Student rahul = new Student(33, "Rahul Shahari", 44.4f);
//        aditya.rno = 4;
//        aditya.name = "Aditya Shahari";
//        aditya.marks = 12.2f;

        System.out.println(aditya.rno);
        System.out.println(aditya.name);
        System.out.println(aditya.marks);

        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);

        aditya.message();
    }
}

class Student {
    int rno;
    String name;
    float marks;

    void message() {
        System.out.println("Hello! My name is " + name);
    }

    Student () {
        // this how you call a constructor from another constructor
        // internally: new Student(13, "default", 100.0f)
        this (13, "default", 100.0f);
    }

    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
