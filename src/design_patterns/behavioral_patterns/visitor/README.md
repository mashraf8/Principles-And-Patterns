# Visitor Design Pattern

The **Visitor Pattern** is a **behavioral design pattern** that lets you **separate algorithms** from the objects on which they operate.  
It allows adding new operations to existing object structures **without modifying** the classes of those elements.

## Participants

| Role              | Responsibility                                                                 |
|-------------------|----------------------------------------------------------------------------------|
| `Visitor`         | Declares a `visit` method for each type of element.                            |
| `ConcreteVisitor` | Implements specific operations for each element type.                          |
| `Element`         | Declares an `accept(Visitor)` method.                                           |
| `ConcreteElement` | Implements the `accept()` method and calls the visitor's `visit()` method.      |
| `Client`          | Builds the object structure and applies visitors to the elements.               |

## Key Idea

Each **element** class implements an `accept(visitor)` method that delegates the call to the **visitor**, passing `this` as an argument.

This double-dispatch mechanism enables the **visitor** to perform operations **specific to the element’s type** without altering the element classes.

## When to Use

- When you need to perform an operation on **all elements of a complex object structure**.
- When the operation logic varies based on the object’s **concrete type**.
- **When you want to isolate operations from the objects they act on**, allowing each class to focus on a single responsibility.
