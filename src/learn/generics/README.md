# Java Generics Example

## Overview

This project demonstrates various concepts of **Generics** in Java, including:
- Generic Classes
- Generic Methods
- Bounded Type Parameters
- Wildcards (`?`)
- Collections with Generics

Java generics allow you to write code that is type-safe and reusable, making it easier to handle different data types without sacrificing type-checking at compile time.

## Project Structure

```plaintext
src/
└── learn/
    └── generics/
        ├── Box.java
        ├── Utils.java
        └── GenericsExamples.java
```

### Key Components:

1. **Box<T> (Generic Class)**:
    - `Box` is a generic class that can hold any type of object (`T`).
    - It demonstrates the use of generics in classes and how to define a generic class.

2. **Utils (Generic Methods and Wildcards)**:
    - Contains static utility methods showcasing generic methods, bounded type parameters, and wildcards (`?`).
    - **Bounded Type Parameters** are demonstrated with a `sum()` method that restricts `T` to `Number` types.
    - **Wildcards (`?`)**: Examples of upper-bounded (`<? extends Number>`) and lower-bounded (`<? super Integer>`) wildcards are shown.

3. **GenericsExamples (Main Class)**:
    - The `GenericsExamples` class is the entry point to demonstrate various generic examples, including using generics with collections.

