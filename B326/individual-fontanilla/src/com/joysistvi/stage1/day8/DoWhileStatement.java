package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class DoWhileStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = "hello@gmail.com";
        String password = "hello1234";

        boolean isLoggedIn = false;

        do {
            System.out.print("Enter email: ");
            String loginEmail = scan.nextLine();

            System.out.println("Enter password: ");
            String loginPass = scan.nextLine();

            if (loginEmail.equals(email) && loginPass.equals(password)) {
                System.out.println("Login Successfully!");

                isLoggedIn = true;
            } else {
                System.out.println("Invalid Username or Password!");
            }
        } while (!isLoggedIn);
    }
}
