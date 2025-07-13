package design_patterns.behavioral_patterns.iterator;

public class ReverseBookIterator implements Iterator
{
    private Book[] books;
    private int position;

    ReverseBookIterator(Book[] books)
    {
        this.books = books;
        this.position = books.length - 1;
    }

    @Override
    public boolean hasNext()
    {
        return position >= 0;
    }

    @Override
    public Book next()
    {
        return books[position--];
    }
}
