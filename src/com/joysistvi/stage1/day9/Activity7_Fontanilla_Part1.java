package com.joysistvi.stage1.day9;

import java.util.Scanner;

public class Activity7_Fontanilla_Part1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //UI
        System.out.println("======================");
        System.out.println("Multiplication Table");
        System.out.println("======================");

        //ask user
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        //Multiplication table
        System.out.println("Multiplication Table of " + number);
        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " * " + i + " = " + product);
        }
    }
}
