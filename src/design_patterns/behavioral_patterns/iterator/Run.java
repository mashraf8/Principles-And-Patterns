package design_patterns.behavioral_patterns.iterator;

public class Run
{
    public static void main(String[] args)
    {
        Book[] books = {
                new Book("Clean Code"),
                new Book("Java"),
                new Book("Design Patterns")
        };

        Library library = new Library(books);

        System.out.println("Normal Order:");
        Iterator normalIterator = library.createIterator();
        while (normalIterator.hasNext())
        {
            Book book = (Book) normalIterator.next();
            System.out.println(book.getTitle());
        }

        System.out.println("\nReverse Order:");
        Iterator reverseIterator = library.createReverseIterator();
        while (reverseIterator.hasNext())
        {
            Book book = (Book) reverseIterator.next();
            System.out.println(book.getTitle());
        }
    }
}
