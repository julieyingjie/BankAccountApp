package org.example;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();

        String file = "/Users/juliejia/Desktop/BankAccountApp/src/main/java/org/example/NewBankAccounts.csv";
        // Read a CSV File then create new accounts based on that data
        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder: newAccountHolder) {
//            System.out.println("New Account");
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
//            System.out.println(name + "  " + sSN + "  " + accountType + "  " +
//                    initDeposit);
            if (accountType.equals("Savings")){
//                System.out.println("Open a Savings account");
                accounts.add(new Savings(name, sSN, initDeposit));
            }
            else if (accountType.equals("Checking")){
//                System.out.println("Open a Checking account");
                accounts.add(new Checking(name, sSN, initDeposit));
            }
            else {
                System.out.println("Error Reading Account Type");
            }
        }

        accounts.get(5).showInfo();

        for (Account ac: accounts ) {
            System.out.println("\n**********************************");
            ac.showInfo();
        }






//        Checking chkacc1 = new Checking("Tom Willson", "321456879", 1500);
//
//        Savings savacc1 = new Savings("Nathan Li", "345678901", 2500);
//
////        savacc1.compound();
//
//        chkacc1.showInfo();
//
//        System.out.println("****************************");
//
//        savacc1.showInfo();

//        savacc1.deposit(5000);
//        savacc1.withdraw(200);
//        savacc1.transfer("Brokerage", 3000);




    }
}
