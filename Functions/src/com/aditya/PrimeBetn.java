package com.aditya;
import java.util.Scanner;

public class PrimeBetn {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter upper and lower bound: ");
        int a = in.nextInt();
        int b = in.nextInt();

        prime(a, b);
    }
    static void prime(int a, int b) {

        int flag = 0;
        for (int i = a; i <= b; i++) {


            int n = 2;
            if (i == 1 || i == 0)
                continue;

            while(n < i) {

                flag = 1;

                if((i%n) == 0) {
                    flag = 0;
                    break;
                }
                n++;
            }

            if (flag == 1)
                System.out.print(i+ " ");
        }
    }
}
