package com.joysistvi.stage2.day23.Activity15_Abstraction;

public class SalesEmployee extends Employee implements Bonusable {
    private double comission;
    private static final double TAX_RATE = 0.12;

    public SalesEmployee(String name, double baseSalary, double comission) {
        super(name, baseSalary);
        this.comission = comission;
    }

    @Override
    public double computeSalary() {
        return baseSalary + comission;
    }

    @Override
    public String getEmployeeType() {
        return "Sales";
    }

    @Override
    public double computeDeductions() {
        return computeSalary() - (TAX_RATE * baseSalary);
    }

    @Override
    public double computeBonus() {
        return comission;
    }

    @Override
    public boolean isEligibileForBonus() {
        return true;
    }
}
