public abstract class Employee {

    protected String name;
    protected int employeeId;
    protected double baseRate;

    public Employee(String name, int employeeId, double baseRate) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseRate = baseRate;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + employeeId);
    }
}
    

