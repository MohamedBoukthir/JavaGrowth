#  Java Anonymous Inner Classes

## Introduction

Anonymous Inner Classes in Java provide a concise way to create instances of classes on the fly without explicitly defining a named class. They are often used for short-lived, one-time use scenarios, where creating a separate class might be cumbersome.

This repository aims to illustrate different use cases for Anonymous Inner Classes, including extending a class, implementing an interface, defining arguments, and employing lambda expressions.

## Extending a Class

In Java, you can create an Anonymous Inner Class that extends a class using the following syntax:

```java
SuperClass instance = new SuperClass() {
    // Override methods or add new methods here
};
```
This allows you to create an instance of SuperClass with additional or overridden behavior.

## Implementing an Interface
To implement an interface using an Anonymous Inner Class, use the following syntax:

```java
InterfaceName instance = new InterfaceName() {
    // Implement interface methods here
};
```

## Defining Arguments
Anonymous Inner Classes can also accept arguments during instantiation. Here's an example with constructor arguments:

```java
SomeInterface instance = new SomeInterface() {
    // Implement interface methods here
}.methodWithArguments(arg1, arg2);
```

## Lambda Expressions
Starting from Java 8, Lambda Expressions provide a concise way to create instances of functional interfaces. This can be considered a more modern and streamlined alternative to Anonymous Inner Classes. Example:

```java
SomeFunctionalInterface instance = (arg1, arg2) -> {
    // Implementation of the functional interface method
};
```

## Local Variables
Anonymous Inner Classes can access final or effectively final local variables from the enclosing scope. Example:

```java
final int localVar = 42;

SomeInterface instance = new SomeInterface() {
    // Implement interface methods here

    // Access local variable
    void accessLocalVariable() {
        System.out.println("Local variable value: " + localVar);
    }
};
```

## Var Keyword
Starting from Java 10, you can use the var keyword to infer the type of local variables. Example:

```java
SomeInterface instance = new SomeInterface() {
    // Implement interface methods here

    // Use var keyword for local variable
    var localVar = "Hello, var!";
};
```