package design_patterns.structural_patterns.facade;

public class Run
{
    public static void main(String[] args)
    {
        BankFacade bank = new BankFacade();
        bank.transfer("123456", 2000);
    }

}
