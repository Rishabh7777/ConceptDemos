package abstractionDemo;

public abstract class DataAbstraction {
    String color;

    // abstract class can have constructor
    DataAbstraction(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // these are abstract methods
    abstract double area();

    public abstract String toString();

    public String getColor() {
        return color;
    }
}
