# State Design Pattern

The **State Pattern** is a **behavioral design pattern** that allows an object to **change its behavior** when its **internal state** changes.

---

## Participants

| Role           | Responsibility                                                                 |
|----------------|----------------------------------------------------------------------------------|
| `Context`      | Maintains a reference to the current state object and delegates behavior to it. |
| `State`        | Declares an interface for state-specific behavior.                              |
| `ConcreteState`| Implements specific behavior associated with a particular state.                |

---

## Key Idea

Rather than using **if-else or switch** statements to handle state transitions, the **State Pattern** encapsulates each state in a separate class, and the context delegates the behavior to the current state object.

---

## When to Use

- When an object’s behavior **depends on its internal state**, and it must change its behavior at runtime.
- When you want to avoid **long conditional statements** scattered across the code.
- When the state-specific behavior is **complex and varies distinctly** from one state to another.

---

## Comparison with Other Patterns

| Pattern      | Purpose                                                 |
|--------------|---------------------------------------------------------|
| **Strategy** | Select behavior from a set of interchangeable algorithms. |
