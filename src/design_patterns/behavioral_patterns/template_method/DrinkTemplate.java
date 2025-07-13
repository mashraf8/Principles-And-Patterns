package design_patterns.behavioral_patterns.template_method;

public abstract class DrinkTemplate
{
    public final void prepareDrink()
    {
        boilWater();
        pourInCup();
        addMainIngredient();
        addExtras();
    }

    private void boilWater()
    {
        System.out.println("Boiling water");
    }

    private void pourInCup()
    {
        System.out.println("Pouring in cup");
    }

    protected abstract void addMainIngredient();
    protected abstract void addExtras();

}
