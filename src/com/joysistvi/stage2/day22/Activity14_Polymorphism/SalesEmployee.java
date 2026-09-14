package com.joysistvi.stage2.day22.Activity14_Polymorphism;

public class SalesEmployee extends Employee {
    private double commission;

    public SalesEmployee(String name, double baseSalary, double commission) {
        super(name, baseSalary);
        this.commission = commission;
    }

    @Override
    public double computeSalary() {
        return super.baseSalary + commission;
    }
}
