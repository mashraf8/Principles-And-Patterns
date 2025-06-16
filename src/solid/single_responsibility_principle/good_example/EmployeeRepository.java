package solid.single_responsibility_principle.good_example;

public class EmployeeRepository
{
    public void saveEmployeeToDatabase(EmployeeData employee)
    {
        System.out.println("Saving employee " + employee.getName() + " to the database");
    }
}
