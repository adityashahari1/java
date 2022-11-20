package com.company.aditya.abstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(15);
        son.career();
        son.partner();
        System.out.println(son.age);

        Daughter daug = new Daughter(21);
        daug.career();
        daug.partner();
        System.out.println(daug.age);
        System.out.println(Parent.sal);

//        System.out.println(son.VALUE);

//        Parent p = new Son(34);
//        Parent p3 = new Daughter(33);

//        System.out.println(p.age);
//        p.career();
//        p.partner();

    }

}
