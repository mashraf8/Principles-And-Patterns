# Factory Method Design Pattern

The **Factory Method Pattern** is a **creational design pattern** that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

## Participants

| Role               | Responsibility                                                                 |
|--------------------|----------------------------------------------------------------------------------|
| `Product`           | Defines the interface of objects the factory method creates.                   |
| `ConcreteProduct`   | Implements the `Product` interface.                                            |
| `Creator`           | Declares the **factory method**, which returns a `Product`. May provide default behavior. |
| `ConcreteCreator`   | Overrides the factory method to return a specific `ConcreteProduct`.            |
| `Client`            | Works with `Product` through the `Creator` interface.                          |

## Key Idea

- The creator class relies on its subclasses to **specify the actual object type** to instantiate.
- Enables code to **adhere to the Open/Closed Principle**—new products can be added without modifying existing code.

## When to Use

- When the exact type of object to create is **determined at runtime**.
- When a class **cannot anticipate** the class of objects it needs to create.
- When you need to provide a **common interface** for different types of products.
- When you want to **decouple the client** from the specific classes it needs to instantiate.
- When you want to **encapsulate complex object creation logic** in one place.