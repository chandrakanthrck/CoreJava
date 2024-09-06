# Object-Oriented Programming (OOP) in Java

## Overview
This folder demonstrates the key concepts of **Object-Oriented Programming (OOP)** in Java. OOP is a programming paradigm based on the concept of objects that contain data and methods. The main principles of OOP are **Abstraction**, **Encapsulation**, **Inheritance**, and **Polymorphism**.

## Key OOP Concepts

### 1. **Abstraction**
- Abstraction is the concept of hiding the implementation details and showing only the functionality to the user.
- Achieved using **Abstract Classes** and **Interfaces**.
- Allows focusing on what an object does rather than how it does it.

### 2. **Encapsulation**
- Encapsulation is the technique of bundling the data (variables) and methods that act on the data into a single unit or class.
- Access to the data is controlled through public methods (getters and setters) while keeping the fields private.
- Provides security and simplifies code maintainability.

### 3. **Inheritance**
- Inheritance allows a new class (subclass) to inherit the properties and methods of an existing class (superclass).
- Promotes code reusability and establishes a natural hierarchical structure.
- Java supports **Single Inheritance**, where a class can inherit from only one superclass.

### 4. **Polymorphism**
- Polymorphism enables one interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation.
- **Method Overloading** and **Method Overriding** are two key ways to implement polymorphism.
    - **Method Overloading**: Multiple methods with the same name but different parameter lists.
    - **Method Overriding**: A subclass provides a specific implementation of a method already defined in its superclass.

## Project Structure

```plaintext
src/
└── oops/
    ├── abstraction/
    │   ├── Animal.java
    │   ├── Dog.java
    │   └── AbstractExample.java
    ├── encapsulation/
    │   ├── Employee.java
    │   └── EncapsulationExample.java
    ├── inheritance/
    │   ├── Person.java
    │   ├── Employee.java
    │   └── InheritanceExample.java
    ├── polymorphism/
    │   ├── MethodOverloading.java
    │   ├── MethodOverriding.java
    │   ├── Animal.java
    │   ├── Cat.java
    ├── interfaces/
    │   ├── Animal.java
    │   ├── Dog.java
    │   └── InterfaceExample.java
```

## How to Run

Each of the above concepts has corresponding classes with examples for better understanding. To run the examples, navigate to the appropriate package and run the `main` method from the example classes, such as `AbstractExample.java`, `EncapsulationExample.java`, etc.

### Example:

```bash
javac src/oops/abstraction/AbstractExample.java
java src.oops.abstraction.AbstractExample
```

## Key Takeaways

- **Abstraction** simplifies complexity by hiding unnecessary details.
- **Encapsulation** protects data and ensures controlled access.
- **Inheritance** promotes code reuse and hierarchical organization.
- **Polymorphism** enhances flexibility by allowing methods to behave differently based on the object that calls them.

## License

This project is licensed under the MIT License.
