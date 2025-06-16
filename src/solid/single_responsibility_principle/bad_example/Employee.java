package solid.single_responsibility_principle.bad_example;

public class Employee
{
    private String name;
    private String employeeId;
    private double salary;

    public Employee(String name, String employeeId, double salary)
    {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // First responsibility: Employee data management
    public String getName()
    {
        return name;
    }

    public String getEmployeeId()
    {
        return employeeId;
    }

    public double getSalary()
    {
        return salary;
    }

    // Second responsibility: Salary-related calculation logic
    public double calculateBonus(double percentage)
    {
        return this.salary * (percentage / 100.0);
    }

    // Third responsibility: Data persistence logic
    public void saveEmployeeToDatabase()
    {
        System.out.println("Saving employee " + this.name + " to the database");
    }

}
