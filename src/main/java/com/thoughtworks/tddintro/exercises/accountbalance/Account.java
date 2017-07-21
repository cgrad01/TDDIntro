package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    public void deposit(int i) {
        balance += i;
    }


    public int getBalance() { return balance; }

    public void withdraw(int i) {
        if (i <= balance) {
            balance -= i;
        }
    }
}
