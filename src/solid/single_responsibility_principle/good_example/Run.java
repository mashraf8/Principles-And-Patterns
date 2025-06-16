package solid.single_responsibility_principle.good_example;

public class Run
{
    public static void main(String[] args)
    {
        EmployeeData emp1 = new EmployeeData("Ahmed Ali", "ID123", 50000);

        // Print All info
        System.out.println("Employee ID: " + emp1.getEmployeeId());
        System.out.println("Employee Name: " + emp1.getName());
        System.out.println("Employee Salary: " + emp1.getSalary());
        System.out.println("------------------------");

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        System.out.println("Bonus: " + salaryCalculator.calculateBonus(emp1,50)); // Calculate bonus
        System.out.println("------------------------");

        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.saveEmployeeToDatabase(emp1); // Save employee
    }
}
