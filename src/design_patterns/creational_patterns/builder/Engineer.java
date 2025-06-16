package design_patterns.creational_patterns.builder;

public class Engineer
{
    private HouseBuilder builder;

    public Engineer(HouseBuilder builder)
    {
        this.builder = builder;
    }

    public void constructHouse()
    {
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildRoof();
    }

    public House getHouse()
    {
        return builder.getHouse();
    }
}
