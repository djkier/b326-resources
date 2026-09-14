package com.joysistvi.stage1.day12;

public class Activity11_Math_Class {
    public static void main(String[] args) {
//        Math.abs() → absolute value
        double num1 = -4.7;
        double absNum1 = Math.abs(num1);

        System.out.println("Original: " + num1);
        System.out.println("Absolute value: " + absNum1);

//        Math.max() → maximum of two values
        int maximum = Math.max(12, 67);
        System.out.println("Maximum: " + maximum);

//        Math.min() → minimum of two values
        int minimum = Math.min(12, 67);
        System.out.println("Minimum: " + minimum);

//        Math.pow() → power (exponentiation)
        double power = Math.pow(2, 3);
        System.out.println("2^3 =" + power);

//        Math.sqrt() → square root
        double squareRoot = Math.sqrt(25);
        System.out.println("Square root of 25: " + squareRoot);

//        Math.round() → round to nearest integer
        double rounded = Math.round(5.7);
        System.out.println("Rounded: " + rounded);

//        Math.ceil() → round up (ceiling)
        double ceiling = Math.ceil(5.2);
        System.out.println("Ceiling: " + ceiling);

//        Math.floor() → round down (floor)
        double floor = Math.floor(5.9);
        System.out.println("Floor: " + floor);

//        Math.random() → random number between 0.0 and 1.0
        double random = Math.random();
        System.out.println("Random: " + random);

//        Math.log() → natural logarithm (base e)
        double naturalLog = Math.log(Math.E);
        System.out.println("Natural log of e: " + naturalLog);

//        Math.log10() → logarithm base 10
        double logBase10 = Math.log10(1000);
        System.out.println("Log10 of 1000: " + logBase10);

//        Math.exp() → exponential function (e^x)
        double exponential = Math.exp(2);
        System.out.println("e^2: " + exponential);

//        Math.sin() → sine of an angle (in radians)
        double sine = Math.sin(Math.toRadians(30));
        System.out.println("sin(30°): " + sine);

//        Math.cos() → cosine of an angle (in radians)
        double cosine = Math.cos(Math.toRadians(60));
        System.out.println("cos(60°): " + cosine);

//        Math.tan() → tangent of an angle (in radians)
        double tangent = Math.tan(Math.toRadians(45));
        System.out.println("tan(45°): " + tangent);
    }
}
