package com.bank;

public class Main_Bank {
    public static void main(String[] args) {
        // Create a SavingAccount
        SavingAccount savingAccount = new SavingAccount("SA001", 2.5);
        savingAccount.deposit(1000);
        System.out.println("Saving Account balance: " + savingAccount.getBalance());

        savingAccount.calculateInterest();
        System.out.println("Saving Account balance after interest calculation: " + savingAccount.getBalance());

        savingAccount.withdraw(500);
        System.out.println("Saving Account balance after withdrawal: " + savingAccount.getBalance());

        // Create a CurrentAccount
        CurrentAccount currentAccount = new CurrentAccount("CA001", 1000);
        currentAccount.deposit(2000);
        System.out.println("Current Account balance: " + currentAccount.getBalance());

        currentAccount.withdraw(3000);
        System.out.println("Current Account balance after withdrawal: " + currentAccount.getBalance());
    }
}

