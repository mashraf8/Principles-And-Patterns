# Adapter Design Pattern

The **Adapter Pattern** is a **structural design pattern** that allows objects with incompatible interfaces to work together.

It acts as a **bridge** between an existing class (with one interface) and a new class (with a different expected interface), **converting the interface of one class into another that the client expects.**

## Participants

| Role         | Description                                                  |
|--------------|--------------------------------------------------------------|
| `Client`     | The system that uses the target interface                    |
| `Target`     | The interface expected by the client                         |
| `Adaptee`    | The existing class with an incompatible interface            |
| `Adapter`    | Converts the interface of the adaptee into the target one    |

## When to Use

- When you want to use an existing class but its interface doesn’t match what you need.
- When you want to reuse a class that cannot be modified.
- When working with legacy systems or third-party libraries.