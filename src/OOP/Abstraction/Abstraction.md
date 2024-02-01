# Java Abstraction

Abstraction is one of the fundamental concepts in object-oriented programming (OOP) that allows you to model real-world 
entities and their behavior in a simplified manner. In Java, abstraction is achieved through abstract classes and interfaces.

Abstraction allows us to model complex systems in a more understandable way by focusing on essential features. 
Abstract classes and interfaces are powerful tools for implementing abstraction in Java.

## Abstract Classes

An abstract class in Java is a class that cannot be instantiated on its own and is meant to be subclassed by other classes. 
It may contain abstract methods (methods without a body) and concrete methods (methods with a body). Abstract classes are
declared using the `abstract` keyword.

```java
// Example abstract class
public abstract class Animal {
    public abstract void makeSound();  // Abstract method
    public void sleep() {
        System.out.println("Zzzz...");  // Concrete method
    }
}
```

# Abstract Methods
Abstract methods are declared in abstract classes without providing an implementation. Subclasses must provide a concrete 
implementation for these methods. They are declared using the abstract keyword.

```java
// Example abstract method
public abstract class Shape {
    public abstract double calculateArea();
}
```

# Interfaces
Interfaces in Java define a contract for a class to implement. They can have abstract methods, default methods, and static 
methods. Classes implement interfaces using the implements keyword.

```java
// Example interface
public interface Drawable {
    void draw();  // Abstract method
    default void display() {
        System.out.println("Displaying...");  // Default method
    }
}
```