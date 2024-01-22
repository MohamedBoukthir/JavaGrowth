# Java Final Keyword Examples

## Final Variables

When applied to a variable, the `final` keyword ensures that the variable's value cannot be changed once it has been assigned. It essentially makes the variable a constant. Final variables must be initialized either at the time of declaration or in the constructor of the class.

```java
public class Example {
    final int constantVariable = 10;

    public void modifyVariable() {
        // Compilation error: Cannot assign a value to final variable 'constantVariable'
        constantVariable = 20;
    }
}
```
## Final Methods
When applied to a method, the final keyword indicates that the method cannot be overridden by subclasses. This is often used to enforce specific behavior that should not be changed in derived classes.

```java
public class Parent {
public final void finalMethod() {
// Some implementation
    }
}

public class Child extends Parent {
// Compilation error: Cannot override the final method from Parent
public void finalMethod() {
// Some other implementation
    }
}
```
## Final Classes
When applied to a class, the final keyword ensures that the class cannot be extended or subclassed. This is commonly used when you want to prevent further specialization of a class.

```java
public final class FinalClass {
    // Class implementation
}

// Compilation error: Cannot inherit from final 'FinalClass'
public class SubClass extends FinalClass {
    // Subclass implementation
}
```
## Final References
The final keyword can also be applied to references, ensuring that the reference cannot be reassigned to a different object. However, the object itself can still be modified.

```java
public class ReferenceExample {
    final int[] array = {1, 2, 3};

    public void modifyReference() {
        // Compilation error: Cannot assign a value to final variable 'array'
        array = new int[]{4, 5, 6};
    }
}
```
# Conclusion
The Final Keyword : 
- Stop value change
- Stop Method Overriding
- Stop inheritance
