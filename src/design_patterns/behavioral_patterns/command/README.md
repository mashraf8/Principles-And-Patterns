# Command Design Pattern

The **Command Pattern** is a **behavioral design pattern** that turns a request into a **standalone object** that contains all the information about the request. This allows you to **parameterize methods**, **delay execution**, and **support undoable operations**.

---

## Participants

| Role          | Responsibility                                                                 |
|---------------|----------------------------------------------------------------------------------|
| `Command`     | Declares the interface for executing and optionally undoing an operation.       |
| `ConcreteCommand` | Implements the `Command` interface and defines the binding between a receiver and an action. |
| `Receiver`     | Knows how to perform the operations associated with carrying out a request.    |
| `Invoker`      | Asks the command to carry out the request.                                     |
| `Client`       | Creates specific command objects and sets their receivers.                     |

---

## Key Idea

Instead of calling methods directly, the **Command Pattern** wraps each action in a **command object**. This allows you to **queue**, **log**, **undo**, or **redo** requests easily, and cleanly decouple the requester from the performer.

---

## When to Use

- When you want to **parameterize objects** with operations to perform.
- When you need to **queue, log, or undo/redo** operations.
- When you want to **decouple senders and receivers** of commands.
---

## Comparison with Other Patterns

| Pattern        | Purpose                                                        |
|----------------|----------------------------------------------------------------|
| **Strategy**   | Choose an algorithm dynamically and interchangeably.           |
| **State**      | Change behavior based on internal state at runtime.            |