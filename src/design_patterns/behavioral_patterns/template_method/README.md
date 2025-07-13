# Template Method Design Pattern

The **Template Method Pattern** is a **behavioral design pattern** that defines the **skeleton of an algorithm** in a base class (abstract class), allowing subclasses to override specific steps without changing the algorithm's overall structure.

---

## Participants

| Role             | Responsibility                                                                                 |
|------------------|-----------------------------------------------------------------------------------------------|
| `AbstractClass`  | Defines the template method and implements the invariant parts of the algorithm.              |
| `ConcreteClass`  | Implements the variable steps of the algorithm.                                               |
| `Client`         | Calls the template method, relying on the base structure and subclass-specific behavior.      |

---

## Key Idea

Instead of duplicating common algorithm logic across multiple classes, the **Template Method** puts the general **workflow in a base class** and lets subclasses **provide their own versions of specific steps**.

The **algorithm structure remains fixed**, but **certain steps are customizable**.

---

## When to Use

- When multiple classes share a **common process** but differ in specific steps.
- When you want to **avoid code duplication** and keep shared logic in one place.
- When the order of steps in an algorithm must be **preserved and enforced**.