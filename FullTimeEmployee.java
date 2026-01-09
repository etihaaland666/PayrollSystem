public class FullTimeEmployee extends Employee {

    private double bonus;
    private int workingDays;

    public FullTimeEmployee(String name, int employeeId, double baseRate,
                            double bonus, int workingDays) {
        super(name, employeeId, baseRate);
        this.bonus = bonus;
        this.workingDays = workingDays;
    }

    @Override
    public double calculateSalary() {
        return baseRate * workingDays + bonus;
    }

    public void showType() {
        System.out.println("Employee Type: Full Time");
    }
}
