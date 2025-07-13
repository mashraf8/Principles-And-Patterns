# Prototype Design Pattern

The **Prototype Pattern** is a **creational design pattern** used to **create new objects by copying existing ones**, known as prototypes. Instead of instantiating new objects from scratch, it **clones pre-existing objects**.

## Participants

| Role        | Responsibility                                                                 |
|-------------|----------------------------------------------------------------------------------|
| `Prototype` | Declares an interface with a `clone()` method to copy itself.                   |
| `ConcretePrototype` | Implements the cloning logic (deep or shallow copy).                    |
| `Client`    | Requests a new object by cloning a prototype instead of using `new`.            |

## Key Idea

- Avoids costly creation of new objects by **cloning a pre-configured instance**.
- Helps when creating an object is expensive (e.g., large setup, resource-intensive).
- Supports **dynamic object creation** at runtime.

## When to Use

- When object creation is **costly** or **resource-intensive**.
- When a system should be **independent of how objects are created**.
- When objects have **many shared configurations** but only a few differences.