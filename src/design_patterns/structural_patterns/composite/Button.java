package design_patterns.structural_patterns.composite;

public class Button implements UIComponent
{
    private String name;

    public Button(String name)
    {
        this.name = name;
    }

    @Override
    public void render()
    {
        System.out.println("Rendering Button: " + name);
    }

    @Override
    public String getName()
    {
        return name;
    }

}
