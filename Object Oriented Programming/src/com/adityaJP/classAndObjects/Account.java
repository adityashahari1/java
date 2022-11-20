package com.adityaJP.classAndObjects;

public class Account {
    int accNo;
    String name;
    int amount;

    void insert(int no, String n, int amt) {
        accNo = no;
        name = n;
        amount = amt;
    }

    void deposit(int amt) {
        amount = amount + amt;
        System.out.println("Amount deposited: " + amt);
        System.out.println("Your Balance: " + amount);
    }

    void withdraw(int amt) {
        if(amount > amt) {
            amount = amount - amt;
            System.out.println("Amount withdrawn: " + amt);
            System.out.println("Your Balance: " + amount);
        }
        else {
            System.out.println("Insufficient balance");
            System.out.println("Your Balance: " + amount);
        }
    }

    void balance() {
        System.out.println("Your Balance: " + amount);
    }

    void display() {
        System.out.println(accNo + " " + name + " " + amount);
    }
}

class AccountEx {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(33412, "Aditya", 1000);
        a1.balance();
        a1.deposit(1000);
        a1.display();
        a1.withdraw(100);
        a1.withdraw(2000);
    }
}