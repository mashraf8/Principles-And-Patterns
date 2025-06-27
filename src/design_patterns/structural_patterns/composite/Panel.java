package design_patterns.structural_patterns.composite;
import java.util.ArrayList;
import java.util.List;


public class Panel implements UIComponent
{
    private String name;
    private List<UIComponent> children = new ArrayList<>();

    public Panel(String name)
    {
        this.name = name;
    }

    public void add(UIComponent component)
    {
        children.add(component);
    }

    @Override
    public void render()
    {
        System.out.println("Rendering Panel: " + name);
        for (UIComponent child : children)
        {
            child.render();
        }
    }

    @Override
    public String getName()
    {
        return name;
    }

}
