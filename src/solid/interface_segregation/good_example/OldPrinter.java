package solid.interface_segregation.good_example;

public class OldPrinter implements Printer
{
    @Override
    public void print(String document)
    {
        System.out.println("Printing: " + document);
    }
}
