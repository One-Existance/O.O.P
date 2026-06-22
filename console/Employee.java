public abstract class Employee {

    private String name;
    private String id;
    private double baseSalary;

    public Employee(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName()        { return name; }
    public String getId()          { return id; }
    public double getBaseSalary()  { return baseSalary; }

    public void setBaseSalary(double s) {
        if (s >= 0) baseSalary = s;
    }

    public abstract double calculatePay();
    public abstract String getRole();

    @Override
    public String toString() {
        return getRole() + " | " + name + " (ID: " + id + ")"
                + "\nBase Salary : TZS " + baseSalary
                + "\nTotal Pay   : TZS " + calculatePay();
    }
}
