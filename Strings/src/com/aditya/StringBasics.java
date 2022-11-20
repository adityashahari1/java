package com.aditya;

import java.util.Arrays;

import static java.lang.Character.*;

public class StringBasics {
    public static void main(String[] args) {
        char ch = 'w';
        char[] chA = {'w', 't', 'y', 's', 'e'};
        String str = "Hello whats";
        String[] strA = {"Hello", "World"};

        //charArray(chA);
        //System.out.println(Arrays.toString(chA));   two ways to convert char array to string
        //System.out.println(String.valueOf(chA));

        //string(str);
        // System.out.println(str);                 prints string including spaces
        //System.out.println(str.toCharArray());    converts to char array



    }

    static void cHar(char ch) { // you can use methods with char but all return boolean value; ex isDigit(ch);
        // You can't convert char to char array

    }

    static void charArray(char[] chA) {
        // to concatenate two chars arrays convert them to strings and concatenate the strings

        chA[1] = 'd'; // to change a char at a specific index

        int a = chA.length;  // to get length of char array
        System.out.println(a);

        // lot of methods in Arrays.(method_name)

        //How to iterate?
        //Use basic for loop with int = index

    }

    static void string(String str) {
        // to use different types of methods on strings use "." operator as we create objects of string

        // two ways to iterate over string
//        for(int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            System.out.print(c);
//        }


//        for(char c : str.toCharArray()) {         foreach loop
//            // process c
//        }

    }

    static void stringArray(String[] strA) {
//        for (String s: strA) {                loop through string
//            //Do your stuff here
//            System.out.println(s);
//        }

//        for(int i = 0; i<strA.length; i++) {
//            System.out.println(strA[i]);
//        }

        // "." operator for methods

    }
}
