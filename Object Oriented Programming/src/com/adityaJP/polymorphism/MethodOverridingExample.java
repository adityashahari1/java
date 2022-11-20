package com.adityaJP.polymorphism;


class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class AXIS extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+ icici.getRateOfInterest());
        System.out.println("AXIS Rate of Interest:" + axis.getRateOfInterest());
    }
}
