package design_patterns.creational_patterns.singleton;

public class Run
{
    public static void main(String[] args)
    {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.executeQuery("SELECT * FROM users");

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.executeQuery("SELECT * FROM products");

        if (db1 == db2)
        {
            System.out.println("Same instance used");
        }
        else
        {
            System.out.println("Different instances");
        }
    }
}
