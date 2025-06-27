# Facade Design Pattern

The **Facade Pattern** is a **structural design pattern** that provides a **simplified interface** to a **complex subsystem**. It hides internal complexities to the client.

---

## Participants

| Role        | Responsibility                                                                 |
|-------------|----------------------------------------------------------------------------------|
| `Facade`    | Offers a simple interface to the complex subsystem.                             |
| `Subsystem` | The set of complex classes that perform the actual work.                        |
| `Client`    | Interacts only with the facade, not the complex subsystem directly.             |

---

## Key Idea

Rather than letting the client deal with many complicated classes and their interactions, the **Facade** acts as a **coordinator**, offering a simplified access point to trigger the entire process.

---

## When to Use

- When you have a **complicated system** with many components.
- When you want to **decouple the client** from the internal implementation details.
- When you repeatedly use the same set of method calls in a specific order.

---

## Does It Violate the Single Responsibility Principle?

| SRP Compliant? | Explanation                                                                 |
|----------------|-----------------------------------------------------------------------------|
| **Yes (possibly)** | If the facade takes on multiple roles (like validation, logging, etc.), it may violate SRP. |
| **No**           | If the facade only delegates to subsystems and keeps coordination logic only, it stays within SRP. |

---

## Comparison with Other Patterns

| Pattern    | Purpose                                          |
|------------|--------------------------------------------------|
| **Proxy**  | Control access, logging, lazy load               |
| **Adapter**| Make incompatible interfaces work together       |
