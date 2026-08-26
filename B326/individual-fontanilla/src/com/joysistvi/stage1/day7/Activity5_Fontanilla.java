package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class Activity5_Fontanilla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //init variables
        double balance = 5000.00;
        int choice;
        double depositAmount;
        double withdrawAmount;

        //menu cli
        System.out.println("=== SIMPLE ATM MENU ===");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Exit");

        //ask for choice
        System.out.print("Enter choice (1-4): ");
        choice = scan.nextInt();

        switch (choice) {
            //check balance
            case 1:
                System.out.println("Your current balance is: " + balance);
                break;

            //deposit
            case 2:
                System.out.print("Enter amount to deposit: ");
                depositAmount = scan.nextDouble();
                if (depositAmount <= 0) {
                    System.out.println("Can't deposit 0 or negative amount. Goodbye!");
                } else {
                    balance += depositAmount;
                    System.out.println("Deposit successfully. New balance: " + balance);
                }
                break;

            //withdraw
            case 3:
                System.out.print("Enter amount to withdraw: ");
                withdrawAmount = scan.nextDouble();
                if (withdrawAmount <= 0) {
                    System.out.println("Can't withdraw 0 or negative amount. Goodbye!");
                } else if (withdrawAmount > balance) {
                    System.out.println("Insufficient balance. Your current balance is: " + balance);
                } else {
                    balance -= withdrawAmount;
                    System.out.println("Withdraw successfully. New balance: " + balance);
                }
                break;

            //exit
            case 4:
                System.out.println("Thank you for using Simple ATM. Goodbye! ");
                break;

            default:
                System.out.println("Choice is not part of the menu. Goodbye!");


        }


    }
}
