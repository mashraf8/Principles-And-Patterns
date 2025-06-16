package design_patterns.creational_patterns.prototype;

public class Run
{
    public static void main(String[] args)
    {
        Person original_shallow = new Person("Mohamed", new Address("Cairo"));
        Person original_deep = new Person("Mohamed", new Address("Cairo"));

        System.out.println("Shallow Original:");
        original_shallow.show();

        Person shallow = original_shallow.shallowCopy();
        shallow.address.city = "Alexandria";
        System.out.println("After Shallow Copy:");
        original_shallow.show();
        shallow.show();

        System.out.println("Deep Original:");
        original_deep.show();

        Person deep = original_deep.deepCopy();
        deep.address.city = "Alexandria";
        System.out.println("After Deep Copy:");
        original_deep.show();
        deep.show();
    }

}
