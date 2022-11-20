package com.company.aditya.generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;   // static because it is not going to be dependent on the object
    private int size;

    CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T value) {
        if(isFull()) {
            resize();
        }

        data[size++] = value;
    }

    public T remove() {
        T removed = (T) (data[size--]);
        return removed;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    private void resize() {
        Object[] temp = new Object[DEFAULT_SIZE * 2];

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

        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
//        list.add(45);
//        list.add(23);
//        list.add(11);
//        list.add("ashdfk");
        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
        System.out.println(list);

    }
}
