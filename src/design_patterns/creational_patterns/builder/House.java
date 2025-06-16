package design_patterns.creational_patterns.builder;

public class House
{
    private String foundation;
    private String walls;
    private String roof;

    public void setFoundation(String foundation)
    {
        this.foundation = foundation;
    }

    public void setWalls(String walls)
    {
        this.walls = walls;
    }

    public void setRoof(String roof)
    {
        this.roof = roof;
    }

    public void show()
    {
        System.out.println("House with " + foundation + ", " + walls + ", and " + roof);
    }
}
