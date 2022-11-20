package com.company.aditya.interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//
//        car.start();      // engine ref variable can access only three methods
//        car.acc();
//        car.stop();
//
//
//        Media media = new Car();
//        media.stop();         // this stops the engine
//


        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.acc();
//        car.upgradeEngine();
//        car.start();
//        car.acc();




    }
}
