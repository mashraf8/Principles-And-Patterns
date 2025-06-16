package design_patterns.creational_patterns.prototype;

public class Person
{
    String name;
    Address address;

    public Person(String name, Address address)
    {
        this.name = name;
        this.address = address;
    }

    // Shallow Copy Method
    public Person shallowCopy()
    {
        return new Person(this.name, this.address);
    }

    // Deep Copy Method
    public Person deepCopy()
    {
        return new Person(this.name, new Address(this.address));
    }

    public void show()
    {
        System.out.println("Name: " + name + ", City: " + address.city);
    }
}
