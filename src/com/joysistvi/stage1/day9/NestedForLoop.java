package com.joysistvi.stage1.day9;

public class NestedForLoop {
    public static void main(String[] args) {

        float var1 = (12_345.01 <= 123_45.00) ? 12_456 : 124_56.02f;
        float var2 = var1+ 1024;
        System.out.print(var2);

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