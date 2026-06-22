package com.example.oop;

abstract class Employee {

    private String name;
    private String id;
    private double baseSalary;

    public Employee(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName()       { return name; }
    public String getId()         { return id; }
    public double getBaseSalary() { return baseSalary; }

    public String setBaseSalary(double s) {
        if (s < 0) return "Rejected. Salary cannot be negative.";
        baseSalary = s;
        return "Base salary updated to TZS " + s;
    }

    public abstract double calculatePay();
    public abstract String getRole();
}
