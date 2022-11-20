package com.company.aditya.exceptionHandling;

public class Main {
    public static void main(String[] args) {

        int a = 4;
        int b = 0;

        // same as -> ArithmeticException e = new Exception();

//        try {
//            int c = a / b;
//        } catch (Exception e) {     // you can also use ArithmeticException
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("This will always execute");
//        }

//        int c = 3;
//        int d = 5;
//
//        try {
//            int f = c / d;
//            throw new Exception("just for fun");
//        } catch (ArithmeticException e) {     // you can also use ArithmeticException
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Normal exception");
//        }
//        finally {
//            System.out.println("This will always execute");
//        }

//        Main2.divide(4, 0);

        b = 2;

        try {
            int c = a / b;

            String name = "Aditya";
            if(name.equals("Aditya")) {
                throw new MyException("name is aditya");
            }
        } catch (Exception e) {     // you can also use ArithmeticException
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always execute");
        }


    }
}
