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
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            return ((feet * 12) * 2.54) + (inches * 2.54);
        } else {
            return -1;
        }
    }

    // overloading calcFeetAndInchesToCentimeters()
    public double calcFeetAndInchesToCentimeters(double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            return inches * 2.54;
        } else {
            return -1;
        }
    }

    // overloaded method using values given through constructor
    public double calcFeetAndInchesToCentimeters() {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            return inches * 2.54;
        } else {
            return -1;
        }
    }
}
