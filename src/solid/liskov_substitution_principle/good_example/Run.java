package solid.liskov_substitution_principle.good_example;

public class Run
{
    public  static void main(String[] args)
    {

        Customer vip_1 = new VIPCustomer("Common");
        Customer regular_1 = new RegularCustomer("Common");

        // getTypeCustomer() Uses base class logic → returns exactly what was passed in constructor.
        System.out.println(vip_1.getTypeCustomer()); // Print Common
        System.out.println("--------------");

        System.out.println(regular_1.getTypeCustomer()); //Print Common
        System.out.println("---------------------------------------------------------------------------");

        //getDiscount() Uses subclass logic → behavior differs based on the actual object.
        Customer vip_2 = new VIPCustomer("VIP");
        Customer regular_2 = new RegularCustomer("Regular");

        System.out.println(vip_2.getTypeCustomer());
        System.out.println(vip_2.getDiscount(100)); //Sub Print 20
        System.out.println("--------------");

        System.out.println(regular_2.getTypeCustomer());
        System.out.println(regular_2.getDiscount(100)); //Sub Print 5
    }
}
