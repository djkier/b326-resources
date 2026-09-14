package com.joysistvi.stage2.day22.Activity14_Polymorphism;

public class ManagerEmployee extends Employee {
    public ManagerEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double computeSalary() {
        return super.baseSalary + 5000;
    }
}
