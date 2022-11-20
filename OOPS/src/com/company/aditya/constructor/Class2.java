package com.company.aditya.constructor;

public class Class2 {
    public static void main(String[] args) {
        final int num;
        num = 3;

        final Stud A = new Stud("Aditya");
        System.out.println(A.name);
        A.name = "Rahul";
        System.out.println(A.name);
        //A = new Stud("Suresh");    this wont work

    }
}

class Stud {
//    final int n;
//
//    Stud() {
//        n = 34;
//
//    }
    String name;

    Stud(String name) {
        this.name = name;
    }

}