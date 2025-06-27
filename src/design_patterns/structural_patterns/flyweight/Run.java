package design_patterns.structural_patterns.flyweight;

public class Run
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 1000; i++)
        {
            SoldierType sniper = SoldierFactory.getSoldier("Sniper", "Rifle", "Green");
            sniper.display(i, i + 5);
        }

        for (int i = 0; i < 1000; i++)
        {
            SoldierType infantry = SoldierFactory.getSoldier("Infantry", "AK47", "Brown");
            infantry.display(i + 10, i + 3);
        }
    }
}
