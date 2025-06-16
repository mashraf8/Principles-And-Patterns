package solid.interface_segregation.bad_example;

public class OldPrinter implements Machine
{
    @Override
    public void print(String document)
    {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document)
    {
        System.out.println("This device does not support scanning.");
    }

    @Override
    public void fax(String document)
    {
        System.out.println("This device does not support fax.");
    }
}
