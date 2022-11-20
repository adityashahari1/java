package com.adityaJP.staticEx;

public class ImpOfStatic { 
    int id;
    String name;
    // String college; if there are 500 students college, all will get memory each tim the object is created

    static String college = "RMD";
    // Solution for the above problem use static

    ImpOfStatic(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id +" "+ name +" "+ college);
    }
}

class StaticEx {
    public static void main(String[] args) {
        ImpOfStatic i1 = new ImpOfStatic(1, "Aditya");
        ImpOfStatic i2 = new ImpOfStatic(2, "Aryan");

        //we can change the college of all objects by the single line of code
        //Student.college="IIT";

        i1.display();
        i2.display();
    }
}
