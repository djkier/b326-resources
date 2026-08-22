package com.joysistvi.stage1.day4;

public class Activity2_Fontanilla {
    public static void main(String[] args) {
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        //Expenses percentage
        double foodAllowancePercentage = (foodAllowance / income) * 100.0;
        double transportationPercentage = (transportation / income) * 100.0;
        double rentPercentage = (rent / income) * 100.0;
        double utilityBillPercentage = (utilityBill / income) * 100.0;

        //Remaining Balance after expenses
        double balance = income - foodAllowance - transportation - rent - utilityBill;

        System.out.printf("Income: %.0f%n", income);
        System.out.printf("Food Allowance: %.1f%%%n", foodAllowancePercentage);
        System.out.printf("Transportation: %.1f%%%n", transportationPercentage);
        System.out.printf("Rent: %.1f%%%n", rentPercentage);
        System.out.printf("Utility Bill: %.1f%%%n", utilityBillPercentage);
        System.out.printf("Remaining Balance: %.0f", balance);
    }
}
