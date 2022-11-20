package com.adityaJP.inheritance;

public class Employee {
    float salary = 4000;
}

class Programmer extends Employee  {
    int bonus = 200;
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary: "+p.salary);
        System.out.println("Programmer bonus: "+p.bonus);
    }
}
