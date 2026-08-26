package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class NestedIfStatement {
    public static void main(String[] args) {
         /*
            if () { outer if
                if () { inner if
                    if () {

                    }
                } else {
                    if () {

                    }
                }
            } else {
                if () {

                }
            }
         */
        Scanner sc = new Scanner(System.in);

        System.out.println(" --- Age Categorizer --- ");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 0 && age <= 2) {
            System.out.println("Category: Baby");
        } else if (age >= 2 && age <= 12) {
            System.out.println("Category: Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Category: Teenager");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
