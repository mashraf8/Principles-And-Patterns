package design_patterns.behavioral_patterns.command;

public class Chef
{
    public void makePizza()
    {
        System.out.println("The chef is preparing pizza.");
    }

    public void cancelPizza()
    {
        System.out.println("Pizza order has been canceled.");
    }

    public void makeJuice()
    {
        System.out.println("The chef is making juice.");
    }

    public void cancelJuice()
    {
        System.out.println("Juice order has been canceled.");
    }
}
