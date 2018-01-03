package com.company;

/**
 * Created by je565 on 1/3/18.
 */
public class BankAccount {

    public double balance;

    public BankAccount(double amt)
    {
        balance = amt;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double d)
    {
        balance += d;
    }

    public void withdraw(double d)
    {
        balance -= d;
    }
}