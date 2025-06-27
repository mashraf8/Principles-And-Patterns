package design_patterns.structural_patterns.facade;

public class TransactionLogger
{
    public void logTransfer(String accountNumber, double amount)
    {
        System.out.println("Logged transfer of " + amount + " from " + accountNumber);
    }
}
