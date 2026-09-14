package com.joysistvi.stage2.day22.Activity14_Polymorphism;

public class RegularEmployee extends Employee {
    public RegularEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + 1000;
    }


}
