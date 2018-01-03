package com.company;

/**
 * Created by je565 on 1/3/18.
 */
public class SavingsAccount extends BankAccount {

    public double interestRate;

    public SavingsAccount(double amount, double rate)
    {
        super(amount);
        interestRate = rate;
    }

    public void addInterest()
    {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
}