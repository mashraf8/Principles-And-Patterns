package solid.single_responsibility_principle.bad_example;

public class Run
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Ahmed Ali", "ID123", 50000);

        // Print All info
        System.out.println("Employee ID: " + emp1.getEmployeeId());
        System.out.println("Employee Name: " + emp1.getName());
        System.out.println("Employee Salary: " + emp1.getSalary());
        System.out.println("------------------------");
        System.out.println("Bonus: " + emp1.calculateBonus(50)); // Calculate bonus
        System.out.println("------------------------");
        emp1.saveEmployeeToDatabase(); // Save employee
    }
}
