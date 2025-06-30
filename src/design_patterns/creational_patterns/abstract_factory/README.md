# Abstract Factory Design Pattern

The **Abstract Factory Pattern** is a **creational design pattern** that provides an interface for creating **families of related or dependent objects** without specifying their concrete classes.

---

## Participants

| Role                  | Responsibility                                                                 |
|------------------------|----------------------------------------------------------------------------------|
| `AbstractFactory`      | Declares a set of methods for creating abstract products.                       |
| `ConcreteFactory`      | Implements the creation methods and returns concrete products.                  |
| `AbstractProduct`      | Declares the interfaces for a type of product.                                  |
| `ConcreteProduct`      | Implements the `AbstractProduct` interfaces.                                    |
| `Client`               | Uses only interfaces declared by `AbstractFactory` and `AbstractProduct`.       |

---

## Key Idea

- Group object creation into **families of products** (e.g., GUI widgets for Windows, macOS, Linux).
- Each `ConcreteFactory` knows how to create all related products for one family.
- The client **remains decoupled** from the actual product implementations.

---

## When to Use

- When your system needs to be **independent of how objects are created**.
- When objects in a system should be **used together as families**.
- When you want to **enforce consistency** among products used together.
- When you want to switch between product families **at runtime**.

---

## Comparison with Other Patterns

| Pattern           | Purpose                                                                           |
|--------------------|-----------------------------------------------------------------------------------|
| **Factory Method** | Creates one product; allows subclasses to alter the type of product created.      |
