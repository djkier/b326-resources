package com.joysistvi.stage1.day5;

public class Activity3_Fontanilla {
    public static void main(String[] args) {
        //Task 2
        int age = 17;
        boolean hasValidID = true;

        String allowed = age >= 18 && hasValidID ? "Yes" : "No";

        System.out.println("--- Task 2: Event Entry Check ---");
        System.out.println("Allowed to enter the event: " + allowed);
        System.out.println();

        //Task 3
        boolean isWeekend = false;
        boolean isHoliday = false;

        String classStatus = isWeekend || isHoliday ? "Yes, no classes." : "No, there's a class.";

        System.out.println("--- Task 3: Class Status Check ---");
        System.out.println("Are there no classes today? " + classStatus);
        System.out.println();

        //Task 3
        int score = 79;

        String passOrFail = score >= 75 ? "Passed" : "Failed";

        System.out.println("--- Task 4: Pass or Fail Check ---");
        System.out.println("Score: " + score);
        System.out.println("Result: " + passOrFail);
        System.out.println();

        //Task 3
        int num1 = 15;
        int num2 = 25;

        int largerNumber = num1 > num2 ? num1 : num2;

        System.out.println("--- Task 5: Larger Number Check ---");
        System.out.println("Number 1: " + num1 + ", Number 2: " + num2);
        System.out.println("The larger number is: " + largerNumber);


    }

}
