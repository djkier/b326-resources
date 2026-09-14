package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class Activity4_Switch_Fontanilla {
    public static void main(String[] args) {
//        For Activity4_Switch_LastName.java:
//        Ask the user to enter a number (1–4).
//        Use a to handle the choices.
//        Options:
//        1 → "You selected Option 1: View Grades"
//        2 → "You selected Option 2: Enroll Subjects"
//        3 → "You selected Option 3: Pay Tuition"
//        4 → "You selected Option 4: Exit"
//        Any other number → "Invalid choice. Please try again later."

        Scanner scan = new Scanner(System.in);

        //Menu
        System.out.println("=== Student Portal Menu ===");
        System.out.println("1. View Grades");
        System.out.println("2. Enroll Subjects");
        System.out.println("3. Pay Tuition");
        System.out.println("4. Exit");

        //Ask user for their choice
        System.out.print("Enter your choice (1-4): ");
        int choice = scan.nextInt();

        //new line
        System.out.println();
        switch (choice) {
            case 1:
                System.out.println("You selected Option 1: View Grades");
                break;
            case 2:
                System.out.println("You selected Option 2: Enroll Subjects");
                break;
            case 3:
                System.out.println("You selected Option 3: Pay Tuition");
                break;
            case 4:
                System.out.println("You selected Option 4: Exit");
                break;
            default:
                System.out.println("Invalid choice. Please try again later.");
        }

    }
}
