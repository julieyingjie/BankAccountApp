package org.example;

public class Savings extends Account{
    // List properties specifics to the Savings accounts
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;


    // Constructor to initialize Savings account properties
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        this.accountNumber = "1" + accountNumber;
        // call a setSafetyDepositBax()
        setSafetyDepositBax();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBax(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }




    // List any methods specific to the Savings account
    public void showInfo(){

        super.showInfo();
        System.out.println(
                "Your Savings Account Features" +
                        "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                        "\n Safety Deposit Box Key: " + safetyDepositBoxKey
        );
    }
}
