package com.company.aditya.inheritance;



public class Box {
    double l;
    double w;
    double h;

    Box() {
        System.out.println("Constructor 1");

        this.l = -1;
        this.w = -1;
        this.h = -1;

    }


    Box(double side) {
        System.out.println("Constructor 2");
        this.l = side;
        this.w = side;
        this.h = side;
    }


    Box(double l, double w, double h) {
        System.out.println("Constructor 3");
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box (Box old) {
        System.out.println("Constructor 4");
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}

class BoxWeight extends Box {

    double weight;

    BoxWeight() {
        this.weight = -1;

    }

    BoxWeight(double l, double w, double h, double weight) {

        // used to initialize values present in parent constructor

        super(l, w, h);
        this.weight = weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }


    BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }
}

class BoxPrice extends BoxWeight {
    double price;

    BoxPrice() {
        super();
        this.price = -1;
    }

    BoxPrice(double side, double weight, double price) {
        super(side, weight);
        this.price = price;
    }


}
