package abstractionDemo;

public abstract class DataAbstraction {
    private String color;

    // abstract class can have constructor
    public DataAbstraction(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // these are abstract methods
    abstract double area();

    public abstract String toString();

    // this is a concrete method
    public String getColor() {
        return color;
    }
}
