package com.aditya;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
    }

    static  int[][] flipAndInvertImage(int[][] image) {


        for(int i = 0; i<image.length - 1; i++) {
            int start = 0;
            int end = image.length - 1;
            while(start < end) {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
            }
            start++;
            end--;
        }
        return image;
    }
}
