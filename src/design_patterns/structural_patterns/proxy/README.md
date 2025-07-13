# Proxy Design Pattern

The **Proxy Pattern** is a structural design pattern that provides a placeholder or surrogate to control access to another object. It adds a level of indirection to support controlled access, lazy loading, logging, remote communication, and more.

## Participants

| Role          | Responsibility |
|---------------|----------------|
| `Subject`     | Common interface for `RealSubject` and `Proxy` |
| `RealSubject` | The actual object that does the real work |
| `Proxy`       | Controls access to the `RealSubject`, adds logic |
| `Client`      | Uses the `Subject` interface to interact |

## Types of Proxy

- **Virtual Proxy**: Delay object creation until needed.
- **Protection Proxy**: Check access rights before delegating.
- **Remote Proxy**: Interact with a remote object.
- **Smart Proxy**: Add additional behavior (e.g., caching, logging).

##  When to Use

- You want to **control access** to an object.
- The object is **expensive** to create (use lazy instantiation).
- The object is located **remotely**.