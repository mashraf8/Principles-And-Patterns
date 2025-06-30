# Singleton Design Pattern

The **Singleton Pattern** is a **creational design pattern** that ensures a class has **only one instance**, and provides a **global point of access** to it.

---

## Participants

| Role        | Responsibility                                                                 |
|-------------|----------------------------------------------------------------------------------|
| `Singleton` | The class that controls the instantiation and ensures only one instance exists. |
| `Client`    | Accesses the instance through a global access point (usually a `getInstance()` method). |

---

## Key Idea

- **Restrict object creation** so that only one instance of the class can exist.
- Provide a **static method** to access that single instance.
- Often implemented using **lazy initialization** or **eager initialization** depending on requirements.

---

## When to Use

- When you need to **control access to shared resources**, like a file system, configuration, or database connection.
- When having **multiple instances would cause problems** (e.g., inconsistent state, resource conflict).
- When you want to enforce **a single point of coordination** across the system.