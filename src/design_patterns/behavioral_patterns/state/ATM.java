package design_patterns.behavioral_patterns.state;

public class ATM
{

    private ATMState currentState;
    private int balance;

    public ATM(int initialBalance)
    {
        currentState = new NoCardState(this);
        this.balance = initialBalance;
    }

    public void setState(ATMState state)
    {
        this.currentState = state;
    }

    public void insertCard()
    {
        currentState.insertCard();
    }

    public void ejectCard()
    {
        currentState.ejectCard();
    }

    public void enterPin(int pin)
    {
        currentState.enterPin(pin);
    }

    public void requestWithdraw(int amount)
    {
        currentState.requestWithdraw(amount);
    }

    public int getBalance()
    {
        return balance;
    }

    public void decreaseBalance(int amount)
    {
        balance -= amount;
    }
}
