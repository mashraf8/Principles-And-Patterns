# Builder Design Pattern

The **Builder Pattern** is a **creational design pattern** used to **construct complex objects step-by-step**. It separates the construction of an object from its representation so that the same construction process can create different representations.

---

## Participants

| Role            | Responsibility                                                                 |
|------------------|----------------------------------------------------------------------------------|
| `Builder`        | Specifies an abstract interface for creating parts of a complex object.         |
| `ConcreteBuilder`| Implements the Builder interface and assembles the parts into a final product.  |
| `Director`       | Constructs an object using the `Builder` interface.                             |
| `Product`        | The complex object being built.                                                 |
| `Client`         | Initiates the building process using the `Director` and a specific `Builder`.   |

---

## Key Idea

- Encapsulate the **construction logic** of a complex object.
- Allows creating **different representations** of the same type of object using the same construction process.
- Makes the construction code **more readable and manageable**.

---

## When to Use

- When the object construction involves **many optional steps** or parts.
- When you want to **reuse the same construction logic** to build different representations.
- When you want to construct complex objects in a **controlled and flexible way**.