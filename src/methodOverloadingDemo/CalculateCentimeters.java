package methodOverloadingDemo;

public class CalculateCentimeters {

    private double feet;
    private double inches;

    // constructor
    public CalculateCentimeters(double feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // getters and setters
    public double getFeet() {
        return feet;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

}
