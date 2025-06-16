## Open/Closed Principle

The Open/Closed Principle means that software should be open for extension but closed for modification.

For example, imagine you have a program that calculates the area of different shapes like Circle, Rectangle, and Triangle. Instead of changing the existing code every time you add a new shape, you create a new class for each shape that knows how to calculate its own area.

This way, you can add new shapes easily by creating new classes, without changing the code that already works. This makes your program easier to maintain and extend.

We apply this principle by using interfaces, which is a key part of the fifth SOLID principle. Interfaces allow us to define a common contract that all shapes follow, so new shapes can be added without modifying existing code.