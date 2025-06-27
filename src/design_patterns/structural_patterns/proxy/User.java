package design_patterns.structural_patterns.proxy;

public class User
{
    private String name;
    private String role; // doctor, secretary

    public User(String name, String role)
    {
        this.name = name;
        this.role = role.toLowerCase();
    }

    public boolean isDoctor()
    {
        return role.equals("doctor");
    }

    public String getName()
    {
        return name;
    }

    public String getRole()
    {
        return role;
    }
}
