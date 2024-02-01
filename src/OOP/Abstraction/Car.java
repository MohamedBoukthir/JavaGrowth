package OOP.Abstraction;

// we cannot create an object from an abstract class
// abstract classes have constructor
// so we need the constructor of the superclass in the subclasses

public abstract class Car {
    float height;
    float width;
    int nbrOfWheels;

    public Car(){}
    public Car(float height, float width, int nbrOfWheels) {
        this.height = height;
        this.width = width;
        this.nbrOfWheels = nbrOfWheels;
    }

    // abstract methods
    abstract void autoPilot();

    abstract void streamingServices();

    abstract void parkingSensors();


    // setters and getters (non-abstract methods or concrete methods)
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public int getNbrOfWheels() {
        return nbrOfWheels;
    }

    public void setNbrOfWheels(int nbrOfWheels) {
        this.nbrOfWheels = nbrOfWheels;
    }
}
