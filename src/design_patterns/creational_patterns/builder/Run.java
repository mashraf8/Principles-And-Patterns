package design_patterns.creational_patterns.builder;

public class Run
{
    public static void main(String[] args)
    {
        // Normal Builder
        HouseBuilder normalBuilder = new ConcreteHouseBuilder();
        Engineer normalEngineer = new Engineer(normalBuilder);
        normalEngineer.constructHouse();
        House normalHouse = normalEngineer.getHouse();
        normalHouse.show();

        // Luxury Builder
        HouseBuilder luxuryBuilder = new LuxuryHouseBuilder();
        Engineer luxuryEngineer = new Engineer(luxuryBuilder);
        luxuryEngineer.constructHouse();
        House luxuryHouse = luxuryEngineer.getHouse();
        luxuryHouse.show();
    }
}
