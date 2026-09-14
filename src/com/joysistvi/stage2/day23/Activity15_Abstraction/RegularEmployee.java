package com.joysistvi.stage2.day23.Activity15_Abstraction;

public class RegularEmployee extends Employee implements Bonusable, Auditable{
    private static final double ATTENDANCE_BONUS = 1000;
    private static final double TAX_RATE = 0.10;


    public RegularEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double computeSalary() {
        return super.baseSalary + ATTENDANCE_BONUS;
    }

    @Override
    public String getEmployeeType() {
        return "Regular Employee";
    }

    @Override
    public double computeDeductions() {
           return baseSalary * TAX_RATE;
    }

    @Override
    public double computeBonus() {
        return ATTENDANCE_BONUS;
    }

    @Override
    public boolean isEligibileForBonus() {
        return true;
    }

    @Override
    public String generateEmployeeId() {
        return "REG-" + super.name.substring(0, 3);
    }

    @Override
    public void logSalaryComputation(String employeeId) {
        System.out.println("Audit log: " + employeeId.toUpperCase() + " salary computed.");
    }


}
