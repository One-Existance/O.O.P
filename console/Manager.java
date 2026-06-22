public class Manager extends Employee {

    private double bonus;

    public Manager(String name, String id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() + bonus;
    }

    @Override
    public String getRole() { return "Manager"; }
}
