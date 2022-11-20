package com.aditya;

public class LongPressed {
    public static void main(String[] args) {        //  revist

        String name = "leelee";
        String typed = "lleeelee";
        System.out.println(isLongPressedName(name, typed));

    }

    static boolean isLongPressedName(String name, String typed) {
        int ind = 0, ind1 = 0;
        int count = 0;

        while(ind <= name.length() - 1 && ind1 <= typed.length() - 1) {
            if(name.charAt(ind) == typed.charAt(ind1)) {
                ind1++;
                count = 0;
            }
            else if(name.charAt(ind) != typed.charAt(ind1)) {
                ind++;
                count++;
            }
            if (count == 2) {
                return false;
            }
        }
        return true;
    }
}
