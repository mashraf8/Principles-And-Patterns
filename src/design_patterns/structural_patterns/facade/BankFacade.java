package design_patterns.structural_patterns.facade;

public class BankFacade
{
    private AccountVerification verifier;
    private BalanceChecker balanceChecker;
    private TransactionLogger logger;

    public void transfer(String accountNumber, double amount)
    {
        verifier = new AccountVerification();
        balanceChecker = new BalanceChecker();
        logger = new TransactionLogger();

        if (verifier.isValid(accountNumber))
        {
            if (balanceChecker.hasSufficientFunds(accountNumber, amount))
            {
                balanceChecker.deductAmount(accountNumber, amount);
                logger.logTransfer(accountNumber, amount);
                System.out.println("Transfer completed successfully!");
            }
            else
            {
                System.out.println("Insufficient balance.");
            }
        }
        else
        {
            System.out.println("Invalid account number.");
        }
    }

}
