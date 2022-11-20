package com.aditya;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letter = {'c', 'f', 'j'};
        char target = 'e';
        char ans = nextGreatestLetter(letter, target);
        System.out.println(ans);

    }
    static char nextGreatestLetter(char[] letter, char target) {
        int start = 0;
        int end = letter.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if (target >= letter[mid]) {
                start = mid + 1;
            } else  {
                end = mid - 1;
            }
        }
        return letter[start % letter.length];
    }
}
