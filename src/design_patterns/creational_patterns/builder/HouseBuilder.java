package design_patterns.creational_patterns.builder;

public interface HouseBuilder
{
    void buildFoundation();
    void buildWalls();
    void buildRoof();
    House getHouse();
}
