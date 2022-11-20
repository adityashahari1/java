package com.company.aditya.comparingObjs;

public class Main {
    public static void main(String[] args) {
        Student rahul = new Student(23, 89.4f);
        Student aniket = new Student(33, 90.4f);

//        if(rahul > aniket) {      error
//            System.out.println("Rahul");
//        }

        if(rahul.compareTo(aniket) < 0) {
            System.out.println("rahul has more marks");
        }

    }
}
