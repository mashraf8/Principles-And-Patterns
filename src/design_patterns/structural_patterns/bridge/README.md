# Bridge Design Pattern

The **Bridge Pattern** is a **structural design pattern** that decouples an abstraction from its implementation so that the two can vary independently.

## Participants

| Role                  | Responsibility                          |
|------------------------|-----------------------------------------|
| `Abstraction`          | Defines the high-level interface (can be an abstract or concrete class) and holds a reference to an implementor. |
| `RefinedAbstraction`   | A subclass that extends `Abstraction` and adds additional behaviors. |
| `Implementor`          | Defines the low-level implementation interface. |
| `ConcreteImplementor`  | Implements the `Implementor` interface. |
| `Client`               | Works only with the `Abstraction`, unaware of the underlying implementation. |

## Key Idea

- The `Abstraction` delegates the actual work to an object implementing the `Implementor` interface.
- Changes to either side (abstraction or implementation) won’t affect the other.

## When to Use

- When abstraction and implementation should be able to vary independently.
- When both the abstraction and the implementation have their own class hierarchies.
- When you want to avoid a **combinatorial explosion** of classes due to multiple dimensions of variation.

## Comparison with Other Patterns
| Pattern     | Purpose                                                                 |
|-------------|-------------------------------------------------------------------------|
| **Decorator** | Add new behaviors to objects **dynamically** without altering their structure. |
| **Adapter**   | Make incompatible interfaces **work together**.                          |
