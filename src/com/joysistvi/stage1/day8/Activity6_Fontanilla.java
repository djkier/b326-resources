package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class Activity6_Fontanilla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = "hello@gmail.com";
        String password = "hello1234";
        int maxAttempts = 3;

        //Welcome UI
        System.out.println("============================");
        System.out.println("WELCOME TO JARETHS.COM");
        System.out.println("============================");

        for(int attempts = 0; attempts <= maxAttempts; attempts++) {
            int remainingAttempts = maxAttempts - attempts;
            if (remainingAttempts <= 0) {
                System.out.println("Maximum attempts has been reached. Try again later.");
                break;
            }

            //ui
            System.out.println("Remaining Attempts: " + remainingAttempts);
            System.out.print("Enter email: ");
            String loginEmail = scan.nextLine();

            System.out.print("Enter password: ");
            String loginPass = scan.nextLine();
            System.out.println("============================");

            //space for new screen
            System.out.printf("%n%n%n%n%n%n%n%n%n%n%n%n%n");

            //Login conditions
            if (!loginEmail.equals(email) && !loginPass.equals(password)) {
                System.out.println("Wrong Email and Password");
            } else if (!loginEmail.equals(email)) {
                System.out.println("Wrong email. Try again.");
            } else if (!loginPass.equals(password)) {
                System.out.println("Wrong password. Try again.");
            } else {
                System.out.println("============================");
                System.out.println("Login successfully!");
                System.out.println("============================");
                break;
            }
            System.out.println("----------------------------");

        }
    }
}
