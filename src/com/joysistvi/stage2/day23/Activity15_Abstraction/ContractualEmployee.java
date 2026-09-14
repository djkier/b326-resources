package com.joysistvi.stage2.day23.Activity15_Abstraction;

public class ContractualEmployee extends Employee implements Auditable{
    private double hoursWorked;
    private double hourlyRate;
    private static final double TAX_RATE = 0.05;

    public ContractualEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name, 0);
    }

    @Override
    public double computeSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String getEmployeeType() {
        return "Contractual";
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }

    @Override
    public String generateEmployeeId() {
        return "CON-" + super.name.substring(0, 3);
    }

    @Override
    public void logSalaryComputation(String employeeId) {
        System.out.println("Audit log: " + employeeId.toUpperCase() + " salary computed.");
    }

}
