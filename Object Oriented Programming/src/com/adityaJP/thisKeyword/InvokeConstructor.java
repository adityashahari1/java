package com.adityaJP.thisKeyword;

public class InvokeConstructor {
    int id;
    String name;
    int salary;
    int fee;

    InvokeConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }
    InvokeConstructor(int id, String name, int salary, int fee) {
        this(id, name);     //Call to this() must be the first statement in constructor.
        this.salary = salary;
        this.fee = fee;
    }

    void display(){
        System.out.println(id+" "+name+" "+salary+" "+fee);
    }
}

class Main2 {
    public static void main(String[] args) {
        InvokeConstructor i1 = new InvokeConstructor(1, "Aditya");
        InvokeConstructor i2 = new InvokeConstructor(2, "Ramesh", 100, 50);
        i1.display();
        i2.display();
    }
}
