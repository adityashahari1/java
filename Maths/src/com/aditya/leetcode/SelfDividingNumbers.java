package com.aditya.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 1, right = 22;
        System.out.println(selfDividingNumbers(left, right));
    }

    static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = left; i<=right; i++) {
            if(selfDivide(i))
                list.add(i);
        }
        return list;
    }

    static boolean selfDivide(int n) {
        int x = n;

        while(x>0) {
            int last = x % 10;
            x = x/10;
            if(last == 0 || n % last != 0)
                return false;
        }
        return true;
    }
}
