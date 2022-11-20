package com.company.aditya.innerClasses;

public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        Main.Inner in = obj.new Inner();
        System.out.println(in.y);
        in.dispInner();
    }

    int x;

    Main() {
        System.out.println("In outer constructor");
        this.x = 20;
    }

    class Inner {
        int y;

        Inner() {
            System.out.println("In inner constructor");
            this.y = 10;
        }


        void dispInner() {
            System.out.println(this.y);
        }

    }

    void dispOuter() {
        System.out.println(this.x);
    }
}
