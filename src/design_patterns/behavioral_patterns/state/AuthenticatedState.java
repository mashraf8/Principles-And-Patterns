package design_patterns.behavioral_patterns.state;

public class AuthenticatedState implements ATMState
{
    ATM atm;

    public AuthenticatedState(ATM atm)
    {
        this.atm = atm;
    }

    @Override
    public void insertCard()
    {
        System.out.println("Transaction in progress.");
    }

    @Override
    public void ejectCard()
    {
        System.out.println("Card ejected.");
        atm.setState(new NoCardState(atm));
    }

    @Override
    public void enterPin(int pin)
    {
        System.out.println("Already authenticated.");
    }

    @Override
    public void requestWithdraw(int amount)
    {
        if (amount > atm.getBalance())
        {
            System.out.println("Insufficient funds.");
        }
        else
        {
            System.out.println("Withdrawn: " + amount);
            atm.decreaseBalance(amount);
            atm.setState(new NoCardState(atm));
        }
    }
}
