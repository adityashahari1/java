package com.aditya;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int precision = 3;
        //System.out.println(sqrt(n, precision));
        System.out.printf("%.3f",sqrt(n, precision));    // pretty printing

    }

    static double sqrt(int n, int precision) {
        int s = 1;
        int e = n;

        double root = 0.0;
        while(s <= e) {
            int mid = s + (e - s)/2;
            if(mid*mid == n) {
                return mid;
            }
            else if(mid*mid > n) {
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
            root = mid;
        }
        double incr = 0.1;


        for(int i = 0; i < precision; i++) {
            while(root * root <= n) {
                root += incr;
            }

            root-=incr;
            incr /= 10;
        }

        return root;
    }
}
