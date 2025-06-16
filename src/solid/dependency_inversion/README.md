## Dependency Inversion Principle

In simple terms, this principle is about **making your code flexible and easy to change**.

Instead of high-level parts of your program (like `OrderService`, `UserManager`, `NotificationService`) depending directly on low-level details (like database classes, file readers, or email senders), they should both depend on **abstract interfaces**.

That way:
- You can easily change how things work (e.g., send SMS instead of Email).
- You avoid breaking your main logic every time something low-level changes.
