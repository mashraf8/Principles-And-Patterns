package design_patterns.behavioral_patterns.template_method;

public class Tea extends DrinkTemplate
{
    @Override
    protected void addMainIngredient()
    {
        System.out.println("Adding tea leaves");
    }

    @Override
    protected void addExtras()
    {
        System.out.println("Adding lemon");
    }
}
