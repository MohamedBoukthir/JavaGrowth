# Object-Oriented Programming Relationships in Java

## Table of Contents
- [Is-a Relationship (Inheritance)](#is-a-relationship-inheritance)
- [Has-a Relationship (Composition)](#part-of-relationship-composition)
- [Has-a Relationship (Aggregation)](#has-a-relationship-aggregation)
- [Association](#association)

## Is-a Relationship (Inheritance)

Inheritance represents an "is-a" relationship, allowing a class to inherit properties and behaviors from another class.

```java
class Animal {
    // properties and methods common to all animals
}

class Dog extends Animal {
    // properties and methods specific to dogs
}
```

## Association
Association represents a relationship between two classes, indicating that they are connected in some way. It can be a "has-a" or "is-a" relationship or a more general connection between classes.

```java
class Student {
    // properties and methods of a student
}

class Course {
    // properties and methods of a course
}

class Enrollment {
    Student student;
    Course course;
    // other properties and methods related to enrollment
}
```

## Has-a Relationship (Aggregation)
Aggregation is a form of "has-a" relationship, where one class has a reference to another class, but the referenced class can exist independently.

```java
class Department {
    // properties and methods of a department
}

class University {
    List<Department> departments; // University has Departments (aggregation)
    // other properties and methods of a university
}
```

## Part-of Relationship (Composition)
Composition represents a "part-of" or "has-a" relationship, where one class is composed of another class as a part.
```java
// Part class representing a component
class Engine {
    // properties and methods of an engine
}

// Whole class composed of Engine as a part
class Car {
    Engine carEngine; // Car has an Engine
    // other properties and methods of a car
}
```

