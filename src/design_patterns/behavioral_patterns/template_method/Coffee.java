package design_patterns.behavioral_patterns.template_method;

public class Coffee extends DrinkTemplate
{
    @Override
    protected void addMainIngredient()
    {
        System.out.println("Adding coffee grounds");
    }

    @Override
    protected void addExtras()
    {
        System.out.println("Adding milk");
    }
}
