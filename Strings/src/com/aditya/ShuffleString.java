package com.aditya;

import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "abc";
        int[] indices = {0,1,2};
        String ans = restoreString1(s, indices);
        System.out.println(ans);
    }

    static String restoreString(String s, int[] indices) {
        char[] cArr = s.toCharArray();
        int i = 0;
        while(i< indices.length) {
            int index = indices[i];
            if(indices[i] != indices[index]) {
                swapChar(cArr, i, indices[i]);
                swapInt(indices, i, indices[i]);
            }
            else {
                i++;
            }
        }
        return String.valueOf(cArr);
    }

    static void swapInt(int[] indices, int x, int y) {
        int temp = indices[x];
        indices[x] = indices[y];
        indices[y] = temp;
    }

    static void swapChar(char[] cArr, int x, int y) {
        char t = cArr[x];
        cArr[x] = cArr[y];
        cArr[y] = t;
    }

    static String restoreString1(String s, int[] indices) {
        char[] charArray = new char[s.length()];
        for(int i = 0; i < indices.length; i++) {
            int pos = indices[i];
            charArray[pos] = s.charAt(i);
        }
        return Arrays.toString(charArray);      // or String.valueOf(charArray)
    }
}

