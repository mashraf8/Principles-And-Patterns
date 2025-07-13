package design_patterns.behavioral_patterns.state;

public class Run
{
    public static void main(String[] args)
    {
        ATM atm = new ATM(1000);

        atm.insertCard();        // Card inserted.
        atm.enterPin(1234);      // Correct PIN.
        atm.requestWithdraw(500);// Withdrawn: 500
        atm.insertCard();        // Card inserted.
        atm.enterPin(9999);      // Wrong PIN.
        atm.ejectCard();         // Card ejected.
    }
}
