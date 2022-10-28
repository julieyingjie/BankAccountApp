package org.example;

public class Savings extends Account{
    // List properties specifics to the Savings accounts
    int safetyDepositBoxID;
    int safetyDepositBoxKey;


    // Constructor to initialize Savings account properties
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        this.accountNumber = "1" + accountNumber;
        System.out.println("Account Number" + this.accountNumber);
        System.out.println("New Savings Account.");
    }


    // List any methods specific to the Savings account
}
