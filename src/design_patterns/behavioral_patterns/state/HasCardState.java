package design_patterns.behavioral_patterns.state;

public class HasCardState implements ATMState
{
    ATM atm;

    public HasCardState(ATM atm)
    {
        this.atm = atm;
    }

    @Override
    public void insertCard()
    {
        System.out.println("Card already inserted.");
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
        if (pin == 1234)
        {
            System.out.println("Correct PIN.");
            atm.setState(new AuthenticatedState(atm));
        }
        else
        {
            System.out.println("Wrong PIN.");
        }
    }

    @Override
    public void requestWithdraw(int amount)
    {
        System.out.println("Enter PIN first.");
    }

}
