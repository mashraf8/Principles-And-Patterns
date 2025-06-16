package solid.interface_segregation.bad_example;

public class Run
{
    public static void main(String[] args)
    {
        OldPrinter oldPrinter = new OldPrinter();

        oldPrinter.print("TestDocument.pdf");
        oldPrinter.scan("TestDocument.pdf");
        oldPrinter.fax("TestDocument.pdf");

        System.out.println("------------------------------------");

        ModernMachine modernMachine = new ModernMachine();

        modernMachine.print("TestDocument.pdf");
        modernMachine.scan("TestDocument.pdf");
        modernMachine.fax("TestDocument.pdf");


    }
}
