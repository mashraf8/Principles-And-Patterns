package design_patterns.behavioral_patterns.state;

public interface ATMState
{
    void insertCard();
    void ejectCard();
    void enterPin(int pin);
    void requestWithdraw(int amount);
}
