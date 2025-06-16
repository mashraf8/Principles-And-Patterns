package solid.liskov_substitution_principle.bad_example;

public class RegularCustomer extends Customer
{
    public RegularCustomer(String type)
    {
      super(type);
    }

    @Override
    public double getDiscount(double price)
    {
        return price * 0.05; // 5% discount
    }
}
