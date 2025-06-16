package solid.liskov_substitution_principle.good_example;

public abstract class Customer
{
    protected String type;
    public Customer(String type)
    {
        this.type = type;
    }

    public String getTypeCustomer()
    {
        return type;
    }

    public abstract double getDiscount(double price);
}
