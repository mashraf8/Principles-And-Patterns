# Behavioral Design Patterns

## What Are Behavioral Patterns?

**Behavioral patterns** are design patterns that focus on **how objects interact and communicate with each other**.  
They help define **responsibilities** among different objects in a system and improve **flexibility** in communication and control flow.

These patterns are especially useful when you need to control the **flow of information**, **delegate responsibilities**, or support **dynamic behavior changes**.

---

## Types of Behavioral Patterns

### 1. Chain of Responsibility

Passes a request along a **chain of handlers**.  
Each handler decides either to process the request or to pass it to the next handler.

---

### 2. Command

Encapsulates a **request or operation** as an object, allowing you to **queue**, **log**, or **undo** operations.

---

### 3. Interpreter

Defines a **grammar** for a language and provides an interpreter to evaluate sentences in the language.

---

### 4. Iterator

Provides a way to **access elements** of a collection **sequentially without exposing the underlying structure**.

---

### 5. Mediator

Defines an object that **centralizes complex communications** and control between related objects (colleagues).

---

### 6. Memento

Captures and **restores the internal state** of an object without violating encapsulation.  
Used for **undo/redo** functionality.

---

### 7. Observer

Defines a **one-to-many dependency** so that when one object changes state, all its dependents are **notified automatically**.

---

### 8. State

Allows an object to **change its behavior** when its **internal state** changes.

---

### 9. Strategy

Enables selecting an **algorithm at runtime** by defining a family of algorithms and making them interchangeable.

---

### 10. Template Method

Defines the **skeleton of an algorithm** in the base class but lets subclasses override specific steps.

---

### 11. Visitor

Separates an algorithm from the object structure it operates on by moving the logic into a **visitor class**.
