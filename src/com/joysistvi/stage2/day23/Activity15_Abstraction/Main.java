package com.joysistvi.stage2.day23.Activity15_Abstraction;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new RegularEmployee("Ana", 15000),
                new SalesEmployee("Ben", 12000, 5000),
                new ContractualEmployee("Cruz", 160, 75)
        };

        for (Employee e : employees) {
            e.printpayslip();

            if (e instanceof Bonusable) {
                Bonusable b = (Bonusable) e;
                if (b.isEligibileForBonus()) {
                    System.out.println("Bonus: " + b.computeBonus());
                }
            }

            if (e instanceof Auditable) {
                Auditable a = (Auditable) e;
                a.logSalaryComputation(a.generateEmployeeId());
            }

            System.out.println("---------------------------------------------------");
        }
    }
}
