package com.company.aditya.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box obj1 = new Box();
//        Box obj2 = new Box(obj1);
//        System.out.println(obj1.l + " " + obj1.w + " " + obj1.h);
//        System.out.println(obj2.l + " " + obj2.w + " " + obj2.h);

//        BoxWeight obj = new BoxWeight();
//        System.out.println(obj.l + " " + obj.w + " " + obj.h + " " + obj.weight);


//        Box obj = new BoxWeight(3, 4, 5, 6);
//        System.out.println(obj.l + " " + obj.w + " " + obj.h );
        //System.out.println(obj.weight);         // error

        //It is important to understand that it is actually the type of ref. variable
        //that actually determines what members can be accessed

//        BoxWeight obj = new Box(4, 5, 6);
//        System.out.println(obj.weight);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class


        BoxPrice obj = new BoxPrice(4, 100, 80);
        System.out.println(obj.l+ " " +obj.w+ " " +obj.h+" " +obj.weight+ " " + obj.price);
    }
}



