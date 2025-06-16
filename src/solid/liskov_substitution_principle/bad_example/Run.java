package solid.liskov_substitution_principle.bad_example;

public class Run
{
    public  static void main(String[] args)
    {
        Customer customer = new Customer("VIP");
        Customer vip = new VIPCustomer("VIP");
        Customer regular = new RegularCustomer("Regular");

        System.out.println(customer.getTypeCustomer());
        System.out.println(customer.getDiscount(100)); //Super Print 10
        System.out.println("--------------");

        System.out.println(vip.getTypeCustomer());
        System.out.println(vip.getDiscount(100)); //Sub Print 20
        System.out.println("--------------");

        System.out.println(regular.getTypeCustomer());
        System.out.println(regular.getDiscount(100)); //Sub Print 5
        System.out.println("--------------");



    }
}
