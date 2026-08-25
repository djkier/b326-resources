package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class Activity4_If_Fontanilla {
    public static void main(String[] args) {
//        Ask the user to enter a number (1–4).
//        1 → "You selected Option 1: Start Game"
//        2 → "You selected Option 2: Load Game"
//        3 → "You selected Option 3: Settings"
//        4 → "You selected Option 4: Exit"
//        Any other number → "Invalid choice. Please try again."

        Scanner scan = new Scanner(System.in);

        System.out.println("=== Main Menu ===");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Settings");
        System.out.println("4. Exit");

        //Ask user choice
        System.out.print("Enter your choice (1-4): ");
        int choice = scan.nextInt();

        //new line
        System.out.println();
        if (choice == 1) {
            System.out.println("You selected Option 1: Start Game");
        } else if (choice == 2) {
            System.out.println("You selected Option 2: Load Game");
        } else if (choice == 3) {
            System.out.println("You selected Option 3: Settings");
        } else if (choice == 4) {
            System.out.println("You selected Option 4: Exit");
        } else {
            System.out.println("Invalid choice. Please try again later.");
        }
    }
}


