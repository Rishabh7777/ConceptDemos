package methodOverloadingDemo;

public class ConversionToCentimeters {

    private double feet;
    private double inches;

    // constructor
    public ConversionToCentimeters(double feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // method to convert feet and inches to centimeters
    public double calcFeetAndInchesToCentimeters(double feet, double inches) {
        return ((feet * 12) * 2.54) + (inches * 2.54);
    }

    // overloading calcFeetAndInchesToCentimeters()
    public double calcFeetAndInchesToCentimeters(double inches) {
        return inches * 2.54;
    }
}
