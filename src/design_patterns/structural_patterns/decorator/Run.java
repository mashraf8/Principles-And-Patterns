package design_patterns.structural_patterns.decorator;

public class Run
{
    public static void main(String[] args)
    {
        // Simple coffee
        Coffee myCoffee = new SimpleCoffee();

        // Add milk
        myCoffee = new MilkDecorator(myCoffee);

        // Add sugar
        myCoffee = new SugarDecorator(myCoffee);

        // Display the final order
        System.out.println("Order: " + myCoffee.getDescription());
        System.out.println("Total cost: " + myCoffee.getCost() + " EGP");
    }
}
