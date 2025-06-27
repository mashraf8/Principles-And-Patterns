package design_patterns.structural_patterns.flyweight;

public class SoldierType
{
    private String type;
    private String weapon;
    private String color;

    public SoldierType(String type, String weapon, String color)
    {
        this.type = type;
        this.weapon = weapon;
        this.color = color;
    }

    public void display(int x, int y)
    {
        System.out.println("Displaying " + type + " with " + weapon +
                " in color " + color + " at (" + x + ", " + y + ")");
    }
}
