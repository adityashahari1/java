package com.company.aditya.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;   // static because it is not going to be dependent on the object
    private int size;

    CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int value) {
        if(isFull()) {
            resize();
        }

        data[size++] = value;
    }

    public int remove() {
        int removed = data[size--];
        return removed;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    private void resize() {
        int[] temp = new int[DEFAULT_SIZE * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(45);
//        list.size();
//        list.get(0);
//        list.set(1, 34);
//        list.isEmpty();
//        list.add("hello");
//        ;

        CustomArrayList list = new CustomArrayList();
        list.add(45);
        list.add(23);
        list.add(11);
        System.out.println(list);

    }
}
