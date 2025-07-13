# Interpreter Design Pattern

The **Interpreter Pattern** is a **behavioral design pattern** that defines a grammar for a language and uses an interpreter to interpret sentences in that language. It is useful for parsing and evaluating expressions written in a simple language.

## Participants

| Role                  | Responsibility                                                                 |
|------------------------|-------------------------------------------------------------------------------|
| `AbstractExpression`   | Declares the `interpret()` method shared by all expression types.             |
| `TerminalExpression`   | Implements interpretation for the most basic elements in the grammar.         |
| `NonTerminalExpression`| Implements grammar rules and interprets by combining expressions.             |
| `Context`              | Stores information that may be needed during interpretation (e.g., input).    |
| `Client`               | Builds the expression tree and calls `interpret()` to evaluate the expression.|

## Key Idea

The **Interpreter Pattern** builds a **class structure that mirrors a grammar**, where each rule or expression is represented by a class. The **expression tree** is then interpreted by traversing and evaluating the tree using polymorphism.

This allows you to **add new grammar rules** easily without modifying existing logic.

## When to Use

- When the grammar is **simple**.
- When you need to **interpret expressions** from a rule-based engine.
- When building a **parser for expressions** such as:
    - Arithmetic (e.g., `3 + 5`)
    - Logic (e.g., `A AND B`)
    - Filters (e.g., `age > 18`)
- When each grammar rule can be represented as a class.