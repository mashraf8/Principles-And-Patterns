package solid.interface_segregation.good_example;

public class ModernMachine implements Printer,ScannerAndFax
{
    @Override
    public void print(String document)
    {
        System.out.println("Printing: " + document);
    }
    @Override
    public void scan(String document)
    {
        System.out.println("Scanning: " + document);
    }

    @Override
    public void fax(String document)
    {
        System.out.println("Sending fax: " + document);
    }
}
