package com.adityaJP.thisKeyword;

public class InvokeMethod {
    int id;
    String name;

    InvokeMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void invoke() {
        greeting();    // internally it is like this.greeting();
    }
    void greeting() {
        System.out.println("Hello "+ name);
    }
}

class Main1 {
    public static void main(String[] args) {
        InvokeMethod i1 = new InvokeMethod(1, "Aditya");
        i1.greeting();
        i1.invoke();
    }
}