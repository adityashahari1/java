package com.adityaJP.staticEx;

public class StaticMethodEx {
    int id;
    String name;
    static String college = "Rmd";

//    void change1(String college) {
//        college = "IIT";
//    }

    static void change(){
        college = "IIT";
    }

    StaticMethodEx(int i, String n){
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id+" "+name+" "+college);
    }
}

class MethodMain {
    public static void main(String[] args) {
        StaticMethodEx.change();     // without creating an object, static methods can be used

        StaticMethodEx s1 = new StaticMethodEx(1, "Aditya");
        StaticMethodEx s2 = new StaticMethodEx(2, "Ramesh");

        s1.display();
        //s1.change1("IIT");
        s2.display();
    }
}
