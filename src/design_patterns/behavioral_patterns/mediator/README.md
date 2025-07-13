# Mediator Design Pattern

The **Mediator Pattern** is a **behavioral design pattern** that defines an object (mediator) that encapsulates how a set of objects interact. This promotes **loose coupling** by preventing objects from referring to each other explicitly and lets you vary their interaction independently.

## Participants

| Role              | Responsibility                                                                 |
|-------------------|----------------------------------------------------------------------------------|
| `Mediator`         | Declares the interface for communication between components (colleagues).       |
| `ConcreteMediator` | Implements coordination logic and keeps references to all components.           |
| `Colleague`        | A component that communicates through the mediator rather than directly.        |

## Key Idea

Instead of letting components communicate **directly** with one another (which creates tight coupling), the **Mediator Pattern** introduces a **central object (mediator)** that handles communication between them.

## When to Use

- When you have a set of objects that **communicate in complex ways**, making the code hard to manage.
- When you want to **reduce coupling** between components.
- When changes in one component should **not directly affect others**.
- When you need to **centralize control** logic that coordinates multiple objects.

## Comparison with Other Patterns

| Pattern      | Purpose                                                                 |
|--------------|-------------------------------------------------------------------------|
| **Observer** | Notify dependent objects of state changes (one-to-many).                |
