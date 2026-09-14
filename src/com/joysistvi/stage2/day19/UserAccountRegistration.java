package com.joysistvi.stage2.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserAccountRegistration {
    private static List<UserAccount> accounts = new ArrayList<>();;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while(true) {
            whitespace();
            headerUI();
            menuUI();

            String choice = input.nextLine();

            whitespace();

            switch (choice) {
                case "1":
                    //account registration
                    accountRegistration(input);
                    break;

                case "2":
                    //view accounts
                    viewAccount(input);
                    break;

                case "3":
                    //exit
                    exitEvent();
                    break;

                default:
                    whitespace();
                    System.out.println("Invalid choice. Try again!");
            }

            enterToContinue(input);
        }



    }

    public static void whitespace() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void headerUI() {
        System.out.println("++++++++++++++++++++++");
        System.out.println("Account Registration");
        System.out.println("++++++++++++++++++++++");
    }

    public static void menuUI() {
        System.out.println("Choose action you want to perform");
        System.out.println("[1] Account Registration");
        System.out.println("[2] View Account");
        System.out.println("[3] Exit");
        System.out.print("Enter your choice: ");
    }

    public static void clientInformationUI(UserAccount user) {
        System.out.println("     Account Registration Page");
        System.out.println("++++++++++++++++++++++++++++++++++");
        userInformationUI(user);
    }

    public static void successCreationUI(UserAccount user) {
        System.out.println("         Success Creation");
        System.out.println("++++++++++++++++++++++++++++++++++");
        userInformationUI(user);
    }

    public static void userInformationUI(UserAccount user) {
        System.out.println("         User Information");
        System.out.println("==================================");
        System.out.println("User ID: " + user.getUserAccountId());
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Middle Name: " + user.getMiddleName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Email Address: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        System.out.println("==================================");
    }

    private static void enterToContinue(Scanner input) {
        System.out.println("[Press \"Enter\" to continue]");
        input.nextLine();
    }


    /*
    *
    * ACCOUNT REGISTRATION
    *
    */

    public static void accountRegistration(Scanner input) {
        UserAccount newAccount = new UserAccount();
        autoIDNumbering(newAccount);

        namePrompt(input, newAccount, "First");
        namePrompt(input, newAccount, "Middle");
        namePrompt(input, newAccount, "Last");
        addressPrompt(input, newAccount);
        emailPrompt(input, newAccount);
        passwordPrompt(input, newAccount);

        accounts.add(newAccount);

        successCreationUI(newAccount);

    }

    public static void namePrompt(Scanner input, UserAccount account, String label) {

        while (true) {
            clientInformationUI(account);
            System.out.print("Enter " + label + " Name : ");
            String name = input.nextLine();

            if (checkName(name)) {
                if (label.equals("First")) {
                    account.setFirstName(name);
                } else if (label.equals("Middle")) {
                    account.setMiddleName(name);
                } else {
                    account.setLastName(name);
                }
                whitespace();
                break;
            }

            System.out.println("Invalid " + label + " Name! Try again.");
            enterToContinue(input);
            whitespace();
        }
    }

    public static void addressPrompt(Scanner input, UserAccount account) {
        while (true) {
            clientInformationUI(account);
            System.out.print("Enter Address: ");
            String address = input.nextLine();

            if (checkAddress(address)) {
                account.setAddress(address);
                whitespace();
                break;
            }

            System.out.println("Invalid Address! Try again.");
            enterToContinue(input);
            whitespace();
        }
    }

    public static void emailPrompt(Scanner input, UserAccount account) {
        while (true) {
            clientInformationUI(account);
            System.out.print("Enter Email: ");
            String email = input.nextLine();

            if (checkEmail(email)) {
                account.setEmail(email);
                whitespace();
                break;
            }

            System.out.println("Invalid Email! Try again.");
            enterToContinue(input);
            whitespace();
        }
    }

    public static void passwordPrompt(Scanner input, UserAccount account) {
        while (true) {
            clientInformationUI(account);
            System.out.print("Enter Password: ");
            String password = input.nextLine();

            if (checkPassword(password)) {
                account.setPassword(password);
                whitespace();
                break;
            }

            System.out.println(
                    "Invalid Password! Password must be at least 8 characters \n"
                            + "and contain an uppercase letter, lowercase letter, number, \n"
                            + "and special character."
            );

            enterToContinue(input);
            whitespace();
        }
    }

    public static void autoIDNumbering(UserAccount user) {
        if (accounts.isEmpty()) {
            user.setUserAccountId(1);
        } else {
            int nextId = accounts.getLast().getUserAccountId() + 1;
            user.setUserAccountId(nextId);
        }
    }

    public static boolean checkName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return false;
        }

        return name.matches("[A-Za-z]+(?:[ '-][A-Za-z]+)*");
    }

    public static boolean checkAddress(String address) {
        if (address == null || address.trim().isEmpty()) {
            return false;
        }

        // Letters, numbers, spaces, comma, period, hyphen, #, apostrophe, and /
        return address.matches("[A-Za-z0-9 .,#'/-]+");
    }

    public static boolean checkEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }

        return email.matches(
                "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
        );
    }

    public static boolean checkPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;
        boolean hasSpecialCharacter = false;

        for (char character : password.toCharArray()) {
            if (Character.isUpperCase(character)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(character)) {
                hasLowercase = true;
            } else if (Character.isDigit(character)) {
                hasNumber = true;
            } else {
                hasSpecialCharacter = true;
            }
        }

        return hasUppercase
                && hasLowercase
                && hasNumber
                && hasSpecialCharacter;
    }


    /*
     *
     * VIEW ACCOUNT
     *
     */

    public static void viewAccount(Scanner input) {
        while (true) {
            viewAccountUI();

            if (!input.hasNextInt()) {
                input.nextLine();
                System.out.println("Invalid choice. Please enter a number.");
                enterToContinue(input);
                whitespace();
                continue;
            }

            int choice = input.nextInt();
            input.nextLine();

            if (choice < 1 || choice > accounts.size()) {
                System.out.println("Choice out of range. Try again!");
                enterToContinue(input);
                whitespace();
                continue;
            }

            // -1 because ArrayList starts at index 0
            whitespace();
            userInformationUI(accounts.get(choice - 1));
            break;
        }
    }

    public static void viewAccountUI() {
        whitespace();
        System.out.println("View Account Page");
        System.out.println("++++++++++++++++++++++++++");

        if (accounts.isEmpty()) {
            //go back
            System.out.println("No account found!");
            return;
        }

        for (UserAccount account : accounts) {
            System.out.println((accounts.indexOf(account) + 1) + ". " + account.getFirstName() + " " + account.getLastName());
        }
        System.out.print("Enter the number of the User to view: ");
    }



    public static void exitEvent() {
        System.out.println("Thank you for using account registration. Goodbye!");
        System.exit(0);
    }
}
