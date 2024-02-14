# Interface 

## Overview

In Java, an interface is a collection of abstract methods. It allows you to define a set of method signatures without providing the implementation. Other classes can then implement these interfaces, providing their own implementation for the methods.

## Difference between abstract class & interface
In Java, both abstract classes and interfaces are used to achieve abstraction, but they have some key differences. Here are the main distinctions between abstract classes and interfaces:

**Abstract Class**:
 * An abstract class can have both abstract (methods without a body) and concrete (methods with a body) methods.
 * An abstract class can have instance variables (fields), constructors, and initializer blocks.
 * It can have access modifiers for methods (public, private, protected).
 * An abstract class can extend only one class (single inheritance).
 * Abstract classes can have a constructor, and it is called when an instance of the concrete subclass is created.

**Interface**:
 * An interface can only have abstract methods (before Java 8) or default and static methods (from Java 8 onwards).
 * All variables in an interface are implicitly public, static, and final (constants).
 * Interfaces support multiple inheritance, meaning a class can implement multiple interfaces.
 * Interfaces cannot have constructors or instance variables.

## Implementing the Interface
To use the interface, create a new class that implements it. Provide the implementation for each method declared in the interface.

### Example

```java
// Definition of an interface
public interface MyInterface {
    void method1();
    int method2(String input);
}

// Implementation of the interface in a class
public class MyClass implements MyInterface {
    public void method1() {
        // Implementation for method1
    }

    public int method2(String input) {
        // Implementation for method2
        return input.length();
    }
}
```