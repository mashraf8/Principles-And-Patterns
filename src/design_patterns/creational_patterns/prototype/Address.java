package design_patterns.creational_patterns.prototype;

public class Address
{
    String city;

    public Address(String city)
    {
        this.city = city;
    }

    // Deep Copy Constructor
    public Address(Address other)
    {
        this.city = other.city;
    }
}
