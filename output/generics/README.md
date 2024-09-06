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

### Generics Concepts
1. **Generic Classes**
    -A generic class can work with any data type. The type is specified when the object is instantiated.

```java
Box<Integer> intBox = new Box<>(123);
Box<String> strBox = new Box<>("Hello");
```
2. **Generic Methods**
    -A generic method allows for type-safe operations across different types without writing separate method versions.

```java
public static <T> void printArray(T[] array) {
    for (T element : array) {
        System.out.print(element + " ");
    }
    System.out.println();
}
```
3. **Bounded Type Parameters
    -You can bound generic types to ensure that the types used must extend a certain class (or implement an interface).

```java
public static <T extends Number> double sum(T num1, T num2) {
    return num1.doubleValue() + num2.doubleValue();
}
```
4. **Wildcards
    -Wildcards (?) allow for flexible usage of generics when you don't know the exact type.

- **Unbounded Wildcard (`?`)**: Allows any type.
- **Upper Bounded Wildcard (`<? extends T>`)**: Allows `T` and its subtypes.
- **Lower Bounded Wildcard (`<? super T>`)**: Allows `T` and its supertypes.

```java
public static void printList(List<?> list) {
    for (Object element : list) {
        System.out.print(element + " ");
    }
}
```
5. **Using Generics in Collections
    -Generics ensure type safety when using Java Collections like List, Map, and Set.

```java
List<Box<String>> boxes = new ArrayList<>();
boxes.add(new Box<>("First"));
boxes.add(new Box<>("Second"));
boxes.add(new Box<>("Third"));
```
### Running the Project
To run the project, simply compile and run the GenericsExamples class. This class will demonstrate various examples of Java generics in action.

### Compile and Run the GenericsExamples class
```bash

javac src/learn/generics/GenericsExamples.java
java src/learn/generics/GenericsExamples
```
### Key Takeaways
Generics allow you to write type-safe, reusable code.
Bounded types restrict generic types to specific class hierarchies.
Wildcards provide flexibility when you don't know the exact type being used.
Generics can be applied to classes, methods, and collections for safer and more reusable code.

### License
This project is licensed under the MIT License.

```vbnet
### Explanation:
- **Overview**: Introduces the project and highlights the key concepts covered.
- **Project Structure**: Provides a clear view of the project folder structure.
- **Generics Concepts**: Explains each generic concept with a brief example.
- **Running the Project**: Instructions on how to run the examples.
- **Key Takeaways**: Summarizes the advantages of using generics.
```
