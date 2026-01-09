import java.util.ArrayList;

public class PayrollSystemDemo {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("Alice", 101, 200, 500, 22));
        employees.add(new PartTimeEmployee("Bob", 102, 0, 80, 15));
        employees.add(new Contractor("Charlie", 103, 0, 5, 300));

        for (Employee e : employees) {
            e.displayInfo();
            System.out.println("Salary: " + e.calculateSalary());
            System.out.println("------------------------");
        }
    }
}