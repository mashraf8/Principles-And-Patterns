# Chain of Responsibility Design Pattern

The **Chain of Responsibility Pattern** is a **behavioral design pattern** that lets you **pass requests along a chain of handlers**. Each handler in the chain either **processes the request** or **passes it to the next handler** in the chain.

---

## Participants

| Role       | Responsibility                                                                                          |
|------------|---------------------------------------------------------------------------------------------------------|
| `Handler`  | Declares an interface or abstract for handling the request and holding a reference to the next handler. |
| `ConcreteHandler` | Implements the handling logic decides whether to process the request or forward it.                     |
| `Client`   | Initiates the request and sends it to the first handler in the chain.                                   |

---

## Key Idea

Instead of coupling the sender of a request to its receiver, this pattern **allows multiple objects to handle the request** without knowing which one will actually do it. The request moves along a chain until it’s handled.

---

## When to Use

- When you want to **decouple senders and receivers** of a request.
- When **more than one handler** process a request.
- When handling logic should be processed in **stages or layers**.