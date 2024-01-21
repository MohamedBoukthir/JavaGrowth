package OOP.Classes_And_Objects;

public class Circle {

    // ----- ATTRIBUTES OF CLASS -----
    private double radius;
    private String color;

    // ----- OPERATORS OF CLASS -----

    // Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // -- Other methods --

    // Calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }
    // Calculate the Circumference
    public double getCircumference() {
        return Math.PI * 2 * radius;
    }
    // ToString Method
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';

    }
}
