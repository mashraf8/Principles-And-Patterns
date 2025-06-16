package design_patterns.creational_patterns.singleton;

public class DatabaseConnection
{
    private static DatabaseConnection instance;

    private DatabaseConnection()
    {
        System.out.println("Database connection created.");
    }

    // public method to get the instance
    public static DatabaseConnection getInstance()
    {
        if (instance == null)
        {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // simulate query execution
    public void executeQuery(String query)
    {
        System.out.println("Executing query: " + query);
    }
}