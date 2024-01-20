# Polymorphism
We can achieve polymorphism in Java using the following ways :
- Method **Overloading** :
Method overloading is a feature in Java that allows a class to have more than one method with the same name,
provided the parameters are different. This is also known as compile-time or static polymorphism.
#### Example:
```java
public class OverloadingExample {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```
- Method **Overriding** : 
Method overriding is a mechanism where a subclass provides a specific implementation for a method that is already defined in its superclass.
This is also known as runtime or dynamic polymorphism
#### Example:
```java
  class Animal {
  void makeSound() {
  System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
@Override
void makeSound() {
System.out.println("Dog barks");
  }
}
```


