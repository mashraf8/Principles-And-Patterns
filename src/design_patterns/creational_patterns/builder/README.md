# Builder Design Pattern

## Definition

The **Builder Pattern** is a **creational design pattern** used to construct complex objects step-by-step. It allows you to create different representations of the same object using the same construction process.

This pattern is especially useful when an object has many optional fields or when you want to avoid using long constructors.

---

## Components

| Component        | Description                                                  |
|------------------|--------------------------------------------------------------|
| `Product`        | The object that's being built (e.g., `House`)                |
| `Builder`        | Interface that defines the building steps                    |
| `ConcreteBuilder`| Provides implementation for the steps                        |
| `Director`       | Orchestrates the building steps in a specific order          |
| `Client`         | Requests the product to be built through the director        |

---

##  When to Use

- When an object has many fields or optional parts.
- When you want to build different versions of the same object.
- When you want to avoid having a constructor with too many parameters.
