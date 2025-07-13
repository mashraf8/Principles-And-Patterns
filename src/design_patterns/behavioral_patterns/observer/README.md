# Observer Design Pattern

The **Observer Pattern** is a **behavioral design pattern** that defines a **one-to-many dependency** between objects, such that when one object (the **Subject**) changes its state, all its dependents (**Observers**) are notified and updated automatically.

## Participants

| Role              | Responsibility                                                               |
|-------------------|------------------------------------------------------------------------------|
| `Subject`         | Maintains a list of observers and provides methods to attach/detach them.    |
| `Observer`        | Defines an interface for receiving updates from the subject.                 |
| `ConcreteSubject` | Implements the subject and notifies observers of any changes in its state.   |
| `ConcreteObserver`| Implements the observer and defines how to respond to subject updates.       |

##  Key Idea

Instead of having observers constantly check the subject for changes, the **subject automatically notifies** all registered observers when its state changes.

This promotes **loose coupling** and makes it easy to add or remove observers dynamically.

## When to Use

- When **one change** should automatically **update multiple objects**.
- When implementing **event-driven systems**.
- When building **real-time notification systems**, such as:
    - UI refresh
    - Messaging alerts
    - Social media notifications
