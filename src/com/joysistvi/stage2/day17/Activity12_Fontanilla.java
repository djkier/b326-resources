package com.joysistvi.stage2.day17;

import java.util.Random;
import java.util.Scanner;

public class Activity12_Fontanilla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            menuUI();

            System.out.print("Choice: ");
            String choice = input.nextLine();
            whiteSpace();

            switch(choice) {
                case "1":
                    oddOrEven(input);
                    break;

                case "2":
                    printName(input);
                    break;

                case "3":
                    findTheSquareRootOf(input);
                    break;

                case "4":
                    exponentCalculator(input);
                    break;

                case "5":
                    randomNumber1To100(input);
                    break;

                case "0":
                    System.exit(0);
                    break;

                default:
                    whiteSpace();
                    System.out.println("Invalid choice. Try again.");

            }
            enterToContinue(input);

        }
    }

    public static void whiteSpace() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void menuUI() {
        whiteSpace();
        System.out.println("Choose a method you want to execute");
        System.out.println("====================================");
        System.out.println("[1] Odd or Even?");
        System.out.println("[2] Print Name 50x");
        System.out.println("[3] Find the Square Root");
        System.out.println("[4] Exponent");
        System.out.println("[5] Random number (1-100)");
        System.out.println("[6] Area of the Circle Calculator");
        System.out.println("[7] Voter or Not");
        System.out.println("[8] Character Counter");
        System.out.println("[9] reverse || esrever");
        System.out.println("[10] Full Name and Age");
        System.out.println("[0] Exit");
    }

    public static void enterToContinue(Scanner input) {
        customEnter(input, "[Press Enter to continue]");
    }

    public static void customEnter(Scanner input, String prompt) {
        System.out.println(prompt);
        input.nextLine();
    }

    public static double validNumber(Scanner input, String prompt) {
        System.out.print(prompt);
        while (!input.hasNextDouble()) {
            input.next(); // discard invalid input
            whiteSpace();
            System.out.println("Invalid input!");
            System.out.println(prompt);
        }

        double number = input.nextInt();
        input.nextLine();

        return number;
    }


    public static void oddOrEven(Scanner input) {
        String prompt = "Enter a valid number: ";

        int number = (int) validNumber(input, prompt);

        String result =  isOddOrEven(number) ? "EVEN" : "ODD";
        System.out.println("The number is " + result);
    }

    public static void printName(Scanner input) {
        System.out.print("Enter a name: ");
        String name;
        while (true) {
            name = input.nextLine();
            whiteSpace();
            if (name.trim().isEmpty()) {
                System.out.println("Invalid. Name cannot be blank");
                System.out.print("Enter name: ");
            } else {
                break;
            }
        }
        print50x(name);
    }

    public static void findTheSquareRootOf(Scanner input) {
        String prompt = "Find the square root of (Enter a number) :";
        double number = validNumber(input, prompt);

        System.out.println("The square root of " + number + " is " + squareRootCalculator(number));
    }

    public static void exponentCalculator(Scanner input) {
        System.out.println("Exponent Calculator");
        System.out.println("-----------------------");

        String prompt1 = "Enter your base number: ";
        String prompt2 = "Enter your exponent: ";

        double base = validNumber(input, prompt1);
        double exponent = validNumber(input, prompt2);

        System.out.println(base + " to the power of " + exponent + " is " + toThePowerOf(base, exponent));
    }

    public static void randomNumber1To100(Scanner input) {
        System.out.println("Random Number Generator (1-100)");
        customEnter(input, "[Press Enter to generate a random number]");

        System.out.println("Your lucky number is " + randomNumberGenerator(1, 100));
    }

    //    - a method to identify if a number is odd or even
    public static boolean isOddOrEven(int num) {
        return num % 2 == 0;
    }

//    - a method to print your name 50 times
    public static void print50x(String name) {
        int count = 0;
        while (count <= 50) {
            count++;
            System.out.println(count + ". " + name);

        }
    }

//    - a method to get the square root of a certain variable
    public static double squareRootCalculator(double num) {
        return Math.sqrt(num);
    }

//    - a method to get the power of a number using base and exponent
    public static double toThePowerOf(double base, double exponent) {
        return Math.pow(base, exponent);
    }

//    - a method to print a random number between 1 and 100
    public static int randomNumberGenerator(int min, int max) {
        int range = max - min +1;
        double randomNumberBaseFromRange = Math.floor(range * Math.random());
        return (int) (min + randomNumberBaseFromRange);
    }

//    - a method to get the area of a circle using the given radius
    public static double areaOfTheCircle(double radius) {
        return Math.PI * toThePowerOf(radius, 2.0);
    }

//    - a method to identify if a person is a voter or not
public static void isAVoter(Scanner input) {
    System.out.println("Are you qualified to vote?");
    System.out.println("=============================");

    String citizen = getYesOrNo(input,
            "Are you a citizen of the Republic of the Philippines?");

    String residentPhilippines = getYesOrNo(input,
            "Have you been a resident of the Philippines for at least one year?");

    String residentLocal = getYesOrNo(input,
            "Have you lived in the city or municipality where you intend to vote for at least six months?");

    String age = getYesOrNo(input,
            "Will you be at least 18 years old on or before election day?");

    String mentallyIncapable = getYesOrNo(input,
            "Have you been declared mentally incapable by a competent authority?");

    String disqualified = getYesOrNo(input,
            "Have you been disqualified due to crimes involving disloyalty to the government?");

    boolean qualified = citizen.equals("Y")
                    && residentPhilippines.equals("Y")
                    && residentLocal.equals("Y")
                    && age.equals("Y")
                    && mentallyIncapable.equals("N")
                    && disqualified.equals("N");

    if (qualified) {
        System.out.println("You are qualified to vote.");
    } else {
        System.out.println("You are not qualified to vote.");
    }
}

public static String getYesOrNo(Scanner input, String question) {
    String answer;

    do {
        System.out.print(question + " (Y/N): ");
        answer = input.nextLine().trim().toUpperCase();

        if (!answer.equals("Y") && !answer.equals("N")) {
            System.out.println("Invalid input. Please enter Y or N only.");
        }

    } while (!answer.equals("Y") && !answer.equals("N"));

    return answer;
}

//    - a method to get the length of a certain word
    public static int wordLength(String word) {
        return word.length();
    }

//    - a method to print a certain word in reverse order
    public static String wordReverse(String word) {
        String[] characters = word.split("");

        for (int i = 0; i < characters.length / 2; i++) {
            String temp = characters[i];

            characters[i] = characters[characters.length - 1 - i];
            characters[characters.length - 1 - i] = temp;
        }
        return String.join("", characters);
    }

//    - a method to print your full name and age
    public static void printInfo(String name, int age) {
        System.out.println("Full Name: " + name);
        System.out.println("Age: " + age);
    }
}
