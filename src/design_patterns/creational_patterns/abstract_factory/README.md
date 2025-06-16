# Abstract Factory

The **Abstract Factory** is a creational design pattern that lets you create **families of related objects** without specifying their exact classes.

It’s very similar to the **Factory Method Pattern** — both patterns hide object creation.

But here's the key difference:
- **Factory Method**: creates **one type of object** using a single method.
- **Abstract Factory**: creates a **set of related objects** (a whole family) using multiple methods.

Think of Abstract Factory as a “super” factory — it gives you a whole set of objects that are designed to work together.

---
## Why Use It?

-  To create **families of related objects** that should work together (e.g. 2D vs 3D shapes, or light vs dark themes).
-  To **hide the object creation logic** from the client code.
-  To follow the **Open/Closed Principle** – your code is open to extension (add new factories), but closed to modification.
-  To keep your code **modular and scalable**, making it easier to change product families without touching core logic.
