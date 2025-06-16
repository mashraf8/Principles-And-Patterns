package solid.liskov_substitution_principle.bad_example;

public class Customer
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

    public double getDiscount(double price)
    {
        return price * 0.1; // 10% discount
    }
}
