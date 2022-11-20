package com.aditya.leetcode;

public class AddBinary {
    public static void main(String[] args) {
        String  a = "1010", b = "1011";
        System.out.println(addBinary(a, b));
    }

    static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuffer sb = new StringBuffer();
        while(i>=0 || j>=0){
            int sum = 0;
            if(i >= 0){
                sum += a.charAt(i) - '0';// -'0' to convert a char to int
                i--;
            }
            if(j>=0){
                sum += b.charAt(j) - '0';
                j--;
            }
            sum += carry;
            sb.append(sum%2);
            carry = sum/2;
        }
        if(carry > 0)
            sb.append(carry);
        return sb.reverse().toString();
    }

}
