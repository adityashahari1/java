package com.adityaJP.classAndObjects;

//An example where we are maintaining records of employees.

public class EmployeeExample {
    int id;
    String name;
    float salary;

    void insert(int r, String n, float s) {
        id = r;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println(id +" "+ name +" "+ salary);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        EmployeeExample e1 = new EmployeeExample();
        EmployeeExample e2 = new EmployeeExample();

        e1.insert(1, "Akshay", 100);
        e2.insert(2, "Ramesh", 200);

        e1.display();
        e2.display();
    }
}
