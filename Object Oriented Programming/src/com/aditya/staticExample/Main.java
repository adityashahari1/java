package com.aditya.staticExample;

public class Main {
    public static void main(String[] args) {
        Human aditya = new Human(21, "Aditya", 3000, false);
        Human rahul = new Human(25, "Rahul", 3033, true);

        fun();
        Main obj = new Main();
        obj.fun2();
    }

    static void fun() {
        //greeting(); // you can use this because it requires an instance
        //but the function you are using in does not depend on instances

        // you cannot access non-static stuff without referencing their instances in
        // a static constant

        //hence, here im referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // We know that something that is not static, belongs to an object
    void greeting() {
        System.out.println("Hello world");
    }
}
