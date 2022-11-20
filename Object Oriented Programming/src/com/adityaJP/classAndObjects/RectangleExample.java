package com.adityaJP.classAndObjects;

public class RectangleExample {
    int length;
    int height;

    void insert(int l, int h) {
        length = l;
        height = h;
    }

    void calculateArea() {
        System.out.println(length * height);
    }
}

class RectangleTest {
    public static void main(String[] args) {
        RectangleExample r1 = new RectangleExample();

        r1.insert(2, 3);
        r1.calculateArea();

        r1.length = 4;
        r1.height = 5;
        r1.calculateArea();
    }
}
