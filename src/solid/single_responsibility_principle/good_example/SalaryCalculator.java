package solid.single_responsibility_principle.good_example;

public class SalaryCalculator
{
    public double calculateBonus(EmployeeData employee, double percentage)
    {
        return employee.getSalary() * (percentage / 100.0);
    }
}
