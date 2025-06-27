#  Mastering SOLID & GoF Patterns

An educational and evolving repository that demonstrates practical implementations of the five SOLID principles and core categories of the Gang of Four (GoF) design patterns — including Creational, Structural, and Behavioral patterns — using Java. The project focuses on writing clean, modular, and extensible code following best practices in object-oriented design.

---

##  Table of Contents & Roadmap

Here you can see what has been completed and what is planned for the future.

###  SOLID Principles (Completed)
* [Single Responsibility Principle (SRP)](./src/solid/single_responsibility_principle)
* [Open/Closed Principle (OCP)](./src/solid/open_closed_principle)
* [Liskov Substitution Principle (LSP)](./src/solid/liskov_substitution_principle)
* [Interface Segregation Principle (ISP)](./src/solid/interface_segregation)
* [Dependency Inversion Principle (DIP)](./src/solid/dependency_inversion)

###  Creational Design Patterns (Completed)
* [Factory Method Pattern](./src/design_patterns/creational_patterns/factory_method)
* [Abstract Factory Pattern](./src/design_patterns/creational_patterns/abstract_factory)
* [Builder Pattern](./src/design_patterns/creational_patterns/builder)
* [Prototype Pattern](./src/design_patterns/creational_patterns/prototype)
* [Singleton Pattern](./src/design_patterns/creational_patterns/singleton)

###  Structural Design Patterns
* [Adapter Pattern](./src/design_patterns/structural_patterns/adapter)
* [Facade Pattern](./src/design_patterns/structural_patterns/facade)
* [Decorator Pattern](./src/design_patterns/structural_patterns/decorator)
* [Bridge Pattern](./src/design_patterns/structural_patterns/bridge)
* [Composite Pattern](./src/design_patterns/structural_patterns/composite)
* [Flyweight Pattern](./src/design_patterns/structural_patterns/flyweight)
* [Proxy Pattern](./src/design_patterns/structural_patterns/proxy)

### Behavioral Design Patterns (In Progress)
* Strategy Pattern
* Observer Pattern
* Command Pattern
* ... More to be added soon

---

## Usage

1.  **Compile all Java files:**
    From the project's root directory, run the following command to compile all `.java` files and place the output in an `out` directory.

    * **On Windows (PowerShell):**
        ```bash
        javac -d out (Get-ChildItem -Path src -Recurse -Filter "*.java").FullName
        ```
    * **On Linux or macOS:**
        ```bash
        javac -d out $(find src -name "*.java")
        ```

2.  **Run a specific example:**
    Use the `java` command, specifying the classpath (`-cp out`) and the fully qualified name of the class you want to run.

    * **Example to run the Singleton pattern:**
        ```bash
        java -cp out design_patterns.creational_patterns.singleton.Run
        ```
    * **Example to run the SRP principle:**
        ```bash
        java -cp out solid.single_responsibility_principle.good_example.Run
        ```

---
## Contact
If you have any questions, suggestions, or feedback, feel free to reach out to us at **Email:** [mohashraf.eng@gmail.com](mailto:mohashraf.eng@gmail.com)

---
## License
This project is licensed under the [MIT License](./LICENSE) © 2025 Mohammed Ashraf.