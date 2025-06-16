package solid.interface_segregation.bad_example;

public class ModernMachine implements Machine
{
    public void print(String document)
    {
        System.out.println("Printing: " + document);
    }

    public void scan(String document)
    {
        System.out.println("Scanning: " + document);
    }

    public void fax(String document)
    {
        System.out.println("Sending fax: " + document);
    }
}
