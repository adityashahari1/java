package com.company.aditya.objectClass;

public class Main {

    int num;
    float gpa;

    Main(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // gets called when garbage collector hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    // it basically gives the string representation
    @Override
    public String toString() {
        return super.toString();
    }

    // number representation of an object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((Main)obj).num;
    }

    public static void main(String[] args) {
//        Main obj = new Main(45);
//        System.out.println(obj.hashCode());

//        Main obj1 = new Main(12, 56.6f);
//        Main obj2 = new Main(12, 78.5f);
//
//        if(obj1 == obj2) {
//            System.out.println("obj1 is equal to obj2");
//        }
//
//        if(obj1.equals(obj2)) {
//            System.out.println("obj1 dot equals obj2");
//        }

        Main obj = new Main(34, 78f);
        System.out.println(obj instanceof Main);

        System.out.println(obj.getClass());  // helps get information about the class
        // also after getClass(). you can have extra features
    }
}
