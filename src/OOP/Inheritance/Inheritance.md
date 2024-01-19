# What do subclasses inherit java ?

A subclass inherits all the members(**fields, methods, nested classes**) from superclass.
Constructor are not members, so they are not inherited bu subclasses, **but the constructor
of the superclass** can be invoked from the subclass.

![Capture.PNG](..%2F..%2F..%2F..%2FCapture.PNG)

# Type of Inheritance

- ### **Single Inheritance** :
  In single inheritance, a class can inherit from only one class.
  There is a clear one-to-one relationship between the base class (parent) and the derived class (child).
  It promotes simplicity and is easy to understand.

- ### **Multilevel Inheritance** :
In multilevel inheritance, a class is derived from another class, and then another class is derived from the second class.
  It forms a chain of inheritance with more than two levels.
  It helps in reusing the code and creating a hierarchy of classes.

- ### **Hierarchical Inheritance** :
  In hierarchical inheritance, multiple classes are derived from a single base class.
  It represents a "tree" structure where a single base class serves as the root, and several derived classes branch out from it.
  Each derived class can have its own additional attributes and methods.

# Access Modifiers and inheritance

there are four access modifiers that can be used to control the visibility of class members: public, private, protected, and package-private (default)
Public members are accessible from anywhere, private members are only accessible within the same class, protected members are accessible within the same package and by subclasses,
and package-private members are accessible only within the same package
The default access modifier is package-private, which means that all members are visible within the same package but aren't visible outside of it
Protected access is similar to package-private access, but it also allows access by subclasses, even if they are in a different package
It is important to choose the appropriate access modifier for each member to ensure proper encapsulation and maintainability of the code