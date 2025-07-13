# Iterator Design Pattern

The **Iterator Pattern** is a **behavioral design pattern** that provides a way to access the elements of a collection **sequentially without exposing its underlying representation**.

## Participants

| Role               | Responsibility                                                                 |
|--------------------|---------------------------------------------------------------------------------|
| `Iterator`         | Declares the interface for accessing and traversing elements (`hasNext()`, `next()`). |
| `ConcreteIterator` | Implements the Iterator interface and keeps track of the current position.     |
| `Aggregate`        | Declares an interface to create an Iterator object.                            |
| `ConcreteAggregate`| Implements the Aggregate interface and returns a ConcreteIterator.             |
| `Client`           | Uses the Iterator to traverse the collection without knowing its internals.    |

## Key Idea

Rather than letting the client access the elements of a collection directly (which exposes its internal structure), the **Iterator** encapsulates the traversal logic.  
This promotes **separation of concerns**: the collection manages the data, and the iterator manages how to traverse it.

## Common Methods in Iterator

| Method      | Description                                  |
|-------------|----------------------------------------------|
| `hasNext()` | Returns `true` if there are more elements.   |
| `next()`    | Returns the next element and advances.       |
| `reset()` *(optional)* | Resets the iterator to the beginning. |
| `remove()` *(optional)*| Removes the current element.       |

## When to Use

- When you want to traverse a complex collection **without exposing its structure**.
- When you need **multiple traversal strategies** (e.g., forward, backward).
- When you want to **unify access logic** for different collection types.