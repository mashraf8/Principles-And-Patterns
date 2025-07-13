package design_patterns.behavioral_patterns.template_method;

public class Run
{
    public static void main(String[] args)
    {
        DrinkTemplate tea = new Tea();
        tea.prepareDrink();
        System.out.println();

        DrinkTemplate coffee = new Coffee();
        coffee.prepareDrink();
    }
}
