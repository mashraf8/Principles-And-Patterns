package design_patterns.behavioral_patterns.iterator;

public interface BookCollection
{
    Iterator createIterator();
    Iterator createReverseIterator();

}
