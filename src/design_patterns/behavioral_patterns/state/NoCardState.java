package design_patterns.behavioral_patterns.state;

public class NoCardState implements ATMState
{
    ATM atm;

    public NoCardState(ATM atm)
    {
        this.atm = atm;
    }

    @Override
    public void insertCard()
    {
        System.out.println("Card inserted.");
        atm.setState(new HasCardState(atm));
    }

    @Override
    public void ejectCard()
    {
        System.out.println("No card to eject.");
    }

    @Override
    public void enterPin(int pin)
    {
        System.out.println("Insert card first.");
    }

    @Override
    public void requestWithdraw(int amount)
    {
        System.out.println("Insert card first.");
    }
}
