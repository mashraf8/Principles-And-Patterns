package solid.liskov_substitution_principle.good_example;

public class VIPCustomer extends Customer
{

    public  VIPCustomer(String type)
    {
        super(type);
    }

    @Override
    public double getDiscount(double price)
    {
        return price * 0.2; // 20% discount
    }
}
