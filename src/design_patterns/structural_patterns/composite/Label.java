package design_patterns.structural_patterns.composite;

public class Label implements UIComponent
{
    private String name;

    public Label(String name)
    {
        this.name = name;
    }

    @Override
    public void render()
    {
        System.out.println("Rendering Label: " + name);
    }

    @Override
    public String getName()
    {
        return name;
    }

}
