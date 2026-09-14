package com.joysistvi.stage2.day22.Activity14_Polymorphism;

public class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double computeSalary() {
        return baseSalary;
    }

    public void printPayslip() {
        System.out.println(name + "'s salary: " + computeSalary());
    }
}
