package design_patterns.behavioral_patterns.iterator;

public class Library implements BookCollection
{
    private Book[] books;

    Library(Book[] books)
    {
        this.books = books;
    }

    @Override
    public Iterator createIterator()
    {
        return new BookIterator(books);
    }

    @Override
    public Iterator createReverseIterator()
    {
        return new ReverseBookIterator(books);
    }
}
