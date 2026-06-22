package com.example.oop;

class Cashier extends Employee {

    private int overtimeHours;
    private double overtimeRate;

    public Cashier(String name, String id, double baseSalary, int overtimeHours, double overtimeRate) {
        super(name, id, baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() + (overtimeHours * overtimeRate);
    }

    @Override
    public String getRole() { return "Cashier"; }
}
