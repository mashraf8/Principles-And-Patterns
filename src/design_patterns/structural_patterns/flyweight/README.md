# Flyweight Design Pattern

The **Flyweight Pattern** is a **structural design pattern** used to **minimize memory usage** by sharing as much data as possible with similar objects.

---

## Participants

| Role               | Responsibility                                                                 |
|--------------------|----------------------------------------------------------------------------------|
| `ConcreteFlyweight`| A class that holds the **intrinsic (shared)** state of the object.              |
| `FlyweightFactory` | Creates and manages flyweight instances. Ensures that objects are reused.       |
| `Client`           | Uses the shared objects and passes **extrinsic (external)** state when needed.  |

---

## Key Idea

Rather than creating a large number of similar objects, reuse a few shared instances (intrinsic state), and pass the varying (extrinsic) data only when needed.

---

## When to Use

- When you have **millions of similar objects**.
- When the objects share common state (e.g., type, color, texture).
- When you want to **optimize memory usage** significantly.