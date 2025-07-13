# Strategy Design Pattern

The **Strategy Pattern** is a **behavioral design pattern** that allows selecting an algorithm's behavior at **runtime**.  

---

## Participants

| Role               | Responsibility                                                                 |
|--------------------|----------------------------------------------------------------------------------|
| `Strategy`         | Interface that defines the common behavior.                                     |
| `ConcreteStrategy` | Implements a specific algorithm or behavior.                                    |
| `Context`          | Maintains a reference to a Strategy object and uses it to execute behavior.     |

---

## Key Idea

Instead of implementing a behavior directly in a class, define separate strategy classes and make them interchangeable.  
This allows the behavior to be selected at runtime without modifying the context.

---

## When to Use

- You have **multiple algorithms** for a specific task.
- You want to **choose an algorithm at runtime**.
- You want to **avoid large `if-else` or `switch-case` statements**.
- You want to **follow the Open/Closed Principle**.

---

## Open/Closed Principle

The **Strategy Pattern** fully adheres to the **Open/Closed Principle**.

New strategies (i.e., algorithms or behaviors) can be added without modifying the existing context or other strategies.  
This means the system is **open for extension** and **closed for modification**.
