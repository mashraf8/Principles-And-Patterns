package solid.interface_segregation.bad_example;

public interface Machine
{
    void print(String document);
    void scan(String document);
    void fax(String document);
}
