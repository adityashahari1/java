package com.adityaJP.thisKeyword;

public class ProblemWithoutThis {
    int roll;
    String name;
    int age;

    ProblemWithoutThis(int roll, String name, int age) {
//        roll = roll;  // program not able to distinguish local variable and instance variable.
//        name = name;  // o/p - 0 null 0
//        age = age;
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(roll+" "+name+" "+age);
    }
}

class Main {
    public static void main(String[] args) {
        ProblemWithoutThis p1 = new ProblemWithoutThis(1, "Aditya", 21);
        ProblemWithoutThis p2 = new ProblemWithoutThis(2, "Ramesh", 20);
        p1.display();
        p2.display();
    }
}

//It is better approach to use meaningful names for variables. So we use same name for instance
//variables and parameters in real time, and always use this keyword.
//https://www.javatpoint.com/this-keyword    // ex for 2 and 3