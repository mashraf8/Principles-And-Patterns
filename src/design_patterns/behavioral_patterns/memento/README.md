# Memento Design Pattern

The **Memento Pattern** is a **behavioral design pattern** that lets you **capture and restore an object's internal state**.  
It is often used to implement features like **undo/redo**.

## Participants

| Role         | Responsibility                                                                 |
|--------------|----------------------------------------------------------------------------------|
| `Originator` | The object whose state needs to be saved and restored.                          |
| `Memento`    | A value object that acts as a snapshot of the Originator’s state.               |
| `Caretaker`  | Stores the Mementos but doesn't operate on their contents.                      |

## Key Idea

The **Originator** creates a **Memento** object to represent its current state.  
This Memento is then stored by a **Caretaker**.  
Later, the Originator can use the Memento to **restore** its previous state.

## When to Use

- When you need to provide **undo/redo** functionality.
- When you want to store a **history of states**.
- When you need to **rollback** to a previous state at runtime.

## Comparison with Other Patterns

| Pattern        | Purpose                                                                       |
|----------------|-------------------------------------------------------------------------------|
| **Prototype**  | Duplicate the entire object including state. Good for lightweight cloning.   |
| **Command**    | Encapsulates a request as an object, allowing you to parameterize clients, queue or log requests. |
