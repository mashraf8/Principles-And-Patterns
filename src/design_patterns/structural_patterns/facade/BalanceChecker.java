package design_patterns.structural_patterns.facade;

public class BalanceChecker
{
    public boolean hasSufficientFunds(String accountNumber, double amount)
    {
        return amount <= 5000;
    }

    public void deductAmount(String accountNumber, double amount)
    {
        System.out.println("Deducted " + amount + " from " + accountNumber);
    }
}
