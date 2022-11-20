package com.company.aditya.gc;

public class Main {
    public static void main(String[] args) {
        Info obj = new Info();
        System.out.println(obj.name);
        for (int i = 0; i < 1000; i++) {
            obj = new Info();
        }

    }
}

class Info {
    String name;
    Info() {
        this.name = "Aditya";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}


