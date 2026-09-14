package com.joysistvi.stage1.day8;

public class WhileLoopStatement {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}

/*
        Scanner scan = new Scanner(System.in);

        String email = "hello@gmail.com";
        String password = "hello1234";

        boolean isLoggedIn = false;
        while (!isLoggedIn) {
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
        }
 */
