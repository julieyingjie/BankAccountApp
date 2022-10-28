package org.example;

public class Checking extends Account{
    // List properties specifics to the checking accounts
    int debitCardNumber;
    int debitCardPin;


    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        this.accountNumber = "2" + accountNumber;
        System.out.println("Account Number" + this.accountNumber);
        System.out.println("New Checking Account.");

    }

    // List any methods specific to the checking account
}
