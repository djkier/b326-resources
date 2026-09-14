package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class Activity9_Fontanilla_String_Methods {
    public static void main(String[] args) {
        //Description use are from https://www.w3schools.com/java/java_ref_string.asp

//        contains() ->
//          - Checks whether a string contains a sequence of characters
//          - returns boolean
        String word = "Hello World";
        if (word.contains("Hello")) {
            System.out.println("The variable says Hello");
        }

//        endsWith() ->
//          - Checks whether a string ends with the specified character(s)
//          - returns boolean
        String endWord = "www.tesda.com.ph";
        if (endWord.endsWith(".ph")) {
            System.out.println("The website is from the Philippines");
        }

//        startsWith() ->
//          - Checks whether a string starts with specified characters
//          - returns boolean
        String startWord = "Aray ko po!";
        if (startWord.startsWith("Aray")) {
            System.out.println("The person is in pain.");
        }

//        indexOf() ->
//          - Returns the position of the first found occurrence of specified characters in a string
//          - Returns int, and returns -1 if the character cannot be found
        String text = "Java Programming";
        System.out.println(text.indexOf("r"));

//        isEmpty()
//          - 	Checks whether a string is empty or not
//          - Returns boolean
        String nothing = "";
        System.out.println(nothing.isEmpty());

//        trim() ->
//          - Removes whitespace from both ends of a string, Returns String
        String haircut = "     Ya, paki-nipisan lang yung taas tapos fade sa gilid     ";
        System.out.println(haircut.trim());

//        replace() ->
//          -	Searches a string for a specified value, and returns a new string where the specified values are replaced
        String favoriteFruit = "Ang paborito kong prutas ay Orange";
        System.out.println(favoriteFruit.replace("Orange", "Sharmaine"));

//        toCharArray()
//          - Converts this string to a new character array
//          - returns array
        String highestScorer = "Linda Walker";
        char[] arr = highestScorer.toCharArray();
        for (char a : arr) {
            System.out.println(arr);
        }
        System.out.println();

//        nextLine().charAt() ->
//          - charAt() gets a character at a specific position.
        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? (Y/N): ");
        char choice = sc.nextLine().charAt(0);

        if(choice == 'Y') {
            System.out.println("Proceed");
        }

//        valueOf()
//         - Converts another data type into a String.
        int sixSeven = 67;
        String numStr = String.valueOf(sixSeven);

//        Stretch Goal
        String country = "Philippines";
        System.out.println("Country first character: " + country.charAt(0));
        System.out.println("Country last character: " + country.charAt(country.length() - 1));

        char[] countryArr = country.toCharArray();
        int pCount = 0;
        int vowelCount = 0;


        for (char ch : countryArr) {
            if (ch == 'P' || ch == 'p') {
                pCount++;
            }

            if (ch == 'A' || ch == 'a' ||
                ch == 'E' || ch == 'e' ||
                ch == 'I' || ch == 'i' ||
                ch == 'O' || ch == 'o' ||
                ch == 'U' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Total P/p count: " + pCount);
        System.out.println("Total vowel count: " + vowelCount);


        sc.close();
    }
}
