package com.aditya;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arry = {100, 34, 22, 14, 10, 1, -2, -4, -33, -233};
        int target = -3;

        int ans = orderAgnosticBS(arry, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arry, int target) {
        int start = 0;
        int end = arry.length - 1;
        boolean isAsc = arry[start] <arry[end];

        while(start<=end) {
            int mid = start + (end - start)/2;

            if(target == arry[mid]) {
                return mid;
            }

            if(isAsc) {
                if(target > arry[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if(target < arry[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
