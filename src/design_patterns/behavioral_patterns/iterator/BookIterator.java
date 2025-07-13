package design_patterns.behavioral_patterns.iterator;

public class BookIterator implements Iterator
{
    private Book[] books;
    private int position = 0;

    BookIterator(Book[] books)
    {
        this.books = books;
    }

    @Override
    public boolean hasNext()
    {
        return position < books.length;
    }

    @Override
    public Book next()
    {
        return books[position++];
    }
}
