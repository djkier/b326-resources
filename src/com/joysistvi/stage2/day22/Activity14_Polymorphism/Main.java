package com.joysistvi.stage2.day22.Activity14_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new RegularEmployee("Ana", 15000),
                new SalesEmployee("Ben", 12000, 5000),
                new ContractualEmployee("Cruz", 160, 75)
        };

        for (Employee e : employees) {
            e.printPayslip();
        }
    }
}
