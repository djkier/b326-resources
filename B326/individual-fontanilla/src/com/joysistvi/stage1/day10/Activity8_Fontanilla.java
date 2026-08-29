package com.joysistvi.stage1.day10;

import java.sql.Array;
import java.util.Scanner;

public class Activity8_Fontanilla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];

        //Ask user for 5 numbers
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < arr.length; i++) {
            int numberSystem = i + 1;
            System.out.print("Number " + numberSystem + ": ");
            arr[i] = scan.nextInt();
        }


        int sum = 0;
        int highest = arr[0];
        int lowest = arr[0];

        //Entered numbers
        System.out.println();
        System.out.println("You've entered: ");
        for (int j = 0; j < arr.length; j++) {
            int numberSystem = j + 1;
            System.out.println(numberSystem + ". " + arr[j]);

            //add the numbers
            sum += arr[j];

            //compare the current index to the highest
            if (arr[j] >= highest) {
                highest = arr[j];
            }

            //compare the current index to the lowest
            if (arr[j] <= lowest) {
                lowest = arr[j];
            }

        }

        double average = (sum * 1.0) / arr.length;

        //Sum, average, highest and lowest number
        System.out.println("Sum = " + sum);
        System.out.printf("Average = %.2f%n",average);
        System.out.println("Highest number = " + highest);
        System.out.println("Lowest number = " + lowest);
    }
}
