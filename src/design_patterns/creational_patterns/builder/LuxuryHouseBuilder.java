package design_patterns.creational_patterns.builder;

public class LuxuryHouseBuilder implements HouseBuilder
{
    private House house;

    public LuxuryHouseBuilder()
    {
        this.house = new House();
    }

    @Override
    public void buildFoundation()
    {
        house.setFoundation("Marble foundation with waterproofing");
    }

    @Override
    public void buildWalls()
    {
        house.setWalls("Glass and steel walls");
    }

    @Override
    public void buildRoof()
    {
        house.setRoof("Smart solar panel roof");
    }

    @Override
    public House getHouse()
    {
        return this.house;
    }
}
