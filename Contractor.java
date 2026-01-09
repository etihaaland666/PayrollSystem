public class Contractor extends Employee {

    private int projectsCompleted;
    private double payPerProject;

    public Contractor(String name, int employeeId, double baseRate,
                    int projectsCompleted, double payPerProject) {
        super(name, employeeId, baseRate);
        this.projectsCompleted = projectsCompleted;
        this.payPerProject = payPerProject;
    }

    @Override
    public double calculateSalary() {
        return projectsCompleted * payPerProject;
    }

    public void showType() {
        System.out.println("Employee Type: Contractor");
    }
}