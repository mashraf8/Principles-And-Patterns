## Liskov Substitution Principle

Imagine you have a program that works with a "Customer" object. Later, you replace it with a "VIP Customer" or a "Regular Customer" — everything in the program should still work correctly, without errors or unexpected behavior.

This is what the Liskov Substitution Principle means:
A subclass should be able to replace its parent class without changing the correctness of the program.

If a subclass changes the way a method behaves in a way that causes problems when used in place of the parent class, then this principle is being violated.

Following this principle helps you write code that is:
- Easy to understand
- Flexible and extendable
- Less prone to unexpected bugs when using different types of objects
