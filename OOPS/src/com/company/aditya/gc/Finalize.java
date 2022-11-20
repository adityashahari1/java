package com.company.aditya.gc;

public class Finalize {
    public static void main(String[] args) {
        Info obj = new Info();
        System.out.println(obj.name);

        //System.out.println(obj.finalize());

    }
}

class Info2 {
    String name;
    Info2() {
        this.name = "Aditya";
    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is destroyed");
//    }
}