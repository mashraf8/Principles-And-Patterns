package design_patterns.creational_patterns.builder;

public class ConcreteHouseBuilder implements HouseBuilder
{
    private House house;

    public ConcreteHouseBuilder()
    {
        this.house = new House();
    }

    @Override
    public void buildFoundation()
    {
        house.setFoundation("Concrete foundation");
    }

    @Override
    public void buildWalls()
    {
        house.setWalls("Brick walls");
    }

    @Override
    public void buildRoof()
    {
        house.setRoof("Tile roof");
    }

    @Override
    public House getHouse()
    {
        return this.house;
    }
}
