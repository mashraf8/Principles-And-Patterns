# Composite Design Pattern

The **Composite Pattern** is a **structural design pattern** used to represent **part-whole hierarchies**. It allows individual objects and compositions of objects to be treated uniformly.

---

## Participants

| Role        | Responsibility                                                                 |
|-------------|----------------------------------------------------------------------------------|
| `Component` | Declares the interface for all objects in the composition (both leaf and composite). |
| `Leaf`      | Represents individual objects that do not have children.                        |
| `Composite` | Represents groups of components that may contain other `Leaf` or `Composite` objects. |
| `Client`    | Uses the `Component` interface to interact with both `Leaf` and `Composite` objects uniformly. |

---

## Key Idea

Treat **individual** objects and **compositions** of objects **uniformly** through a shared interface.

For example, a `Panel` in a UI might contain `Button`s or other `Panel`s. Both buttons and panels implement the same interface, allowing you to handle them the same way in client code.

---

## When to Use

- You want to **represent tree structures** of objects.
- You want to treat **leaf** and **composite** objects the same way.
- You want to simplify **client code** by applying recursive composition.

---
## Comparison with Other Patterns

| Pattern       | Purpose                                                                 |
|---------------|-------------------------------------------------------------------------|
| **Decorator** | Dynamically adds new responsibilities to objects.                       |
| **Bridge**    | Separates abstraction from implementation to allow independent changes. |
