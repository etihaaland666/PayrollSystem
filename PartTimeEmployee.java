public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int employeeId, double baseRate,
                            int hoursWorked, double hourlyRate) {
        super(name, employeeId, baseRate);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void showType() {
        System.out.println("Employee Type: Part Time");
    }
}