public class Main {

    public static void main(String[] args) {

        System.out.println("===== Employee Payroll System =====\n");

        Employee manager = new Manager("Julius", "MGR-001", 1500000, 500000);
        Employee cashier = new Cashier("Asha", "CSH-001", 800000, 20, 5000);

        System.out.println(manager);
        System.out.println();
        System.out.println(cashier);

        System.out.println("\n--- Encapsulation: updating base salary via setter ---");
        manager.setBaseSalary(-999);
        System.out.println("Set to -999: rejected. Pay still TZS " + manager.calculatePay());
        manager.setBaseSalary(1800000);
        System.out.println("Set to 1800000: accepted. Pay now TZS " + manager.calculatePay());
    }
}
