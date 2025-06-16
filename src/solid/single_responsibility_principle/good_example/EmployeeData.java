package solid.single_responsibility_principle.good_example;

public class EmployeeData
{
    private String name;
    private String employeeId;
    private double salary;

    public EmployeeData(String name, String employeeId, double salary)
    {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

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

}
