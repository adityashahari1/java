package com.aditya;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
    }

    static int lengthOfLastWord(String s) {
        int len = 0;

        for(int i = s.length() - 1; i>=0; i--) {
            if(s.charAt(i) == ' ') {
                i--;
                if(len != 0)
                    return len;
            }
            else {
                len++;
            }
        }
        return len;
    }
}
