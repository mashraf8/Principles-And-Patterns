#  Prototype Design Pattern

##  Definition

The **Prototype Pattern** is a **creational design pattern** that allows you to **create new objects by cloning existing ones**, rather than instantiating new objects from scratch.

This pattern is especially useful when the cost of creating a new object is **expensive or complex**, and you need many similar objects.

It supports two types of copying:

- **Shallow Copy**: Copies the top-level object only; nested objects (references) are shared.
- **Deep Copy**: Copies both the top-level object and all nested objects recursively, producing a fully independent copy.

---

##  Benefits of Prototype Pattern

-  **Improves performance**: Avoids costly object creation (e.g., from databases, heavy computation).
-  **Simplifies object creation**: Especially when constructors are complex or full of parameters.
-  **Flexible**: You can define different "prototype" objects and clone them as needed.