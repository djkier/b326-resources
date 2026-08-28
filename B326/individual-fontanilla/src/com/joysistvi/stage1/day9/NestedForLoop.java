package com.joysistvi.stage1.day9;

public class NestedForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int product = i * j;
                System.out.println(i + " * " + j + " = " + product);
            }
            System.out.println();
        }

    }
}

// Whenever an outer loop executes, inner loop executes completely


/*
    //              3 <= 3
        for (int i = 1; i <= 3; i++) { // outer for loop
            System.out.println(i);
            //              4 <= 3
            for (int j = 1; j <= 3; j++) { // inner for loop
                System.out.println("\t" + j);
            }
        }


        //              3
        for (int i = 1; i <= 3; i++) {
            //              1
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }

            System.out.println(); // new line
        }
 */


/*
    Half-Pyramid
    for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println(); // new line
        }
 */