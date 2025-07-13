# Decorator Design Pattern

The **Decorator Pattern** is a **structural design pattern** that lets you **dynamically add new behavior** to objects by placing them inside special wrapper objects (called decorators).

It follows the **Open/Closed Principle** — you can extend an object’s behavior **without modifying its code**.

## Participants

| Role               | Responsibility                                                      |
|--------------------|----------------------------------------------------------------------|
| `Component`        | Interface or abstract class defining the object’s behavior           |
| `ConcreteComponent`| The original object to which you want to add new behavior            |
| `Decorator`        | Abstract class that implements `Component` and holds a `Component`  |
| `ConcreteDecorator`| Adds extra behavior by extending `Decorator`                        |
| `Client`           | Uses `Component` interface and can wrap objects with decorators      |

##  Key Idea

Instead of using **inheritance** to extend behavior, you use **composition** — you "wrap" the original object with a decorator.

Each decorator:
- Implements the same interface.
- Holds a reference to another `Component`.
- Can modify or extend the behavior before/after delegating.

##  When to Use

- When you want to **add behavior** to objects **at runtime**.
- When you want to avoid subclass explosion from inheritance.
- When you need **flexible combinations** of behaviors (e.g., coffee with milk, sugar, etc.).
- When you follow the **Single Responsibility Principle** — each class has one job.
