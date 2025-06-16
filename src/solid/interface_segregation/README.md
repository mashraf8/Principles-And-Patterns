## Interface Segregation Principle

This principle is all about **keeping interfaces small and focused**.

Instead of forcing a class to implement a big interface that contains many methods it doesn’t need, we should split that interface into smaller, more specific ones.

Imagine a machine interface that has `print()`, `scan()`, and `fax()` methods. If an old printer can only print, it shouldn’t be forced to implement `scan()` and `fax()` — because it doesn’t support them!

By applying this principle:
- Each class only implements what it really needs.
- Your code becomes cleaner and easier to maintain.
- You avoid writing dummy or error-throwing methods just to satisfy an interface.