package methodOverloadingDemo;

public class ConversionToCentimeters {

    private double feet;
    private double inches;

    // constructor
    public ConversionToCentimeters(double feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // overloaded method using values given through constructor
    public double calcFeetAndInchesToCentimeters() {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            return ((feet * 12) * 2.54) + (inches * 2.54);
        } else {
            return -1;
        }
    }

    // method to convert feet and inches to centimeters
    // 2nd method, first overloaded
    public double calcFeetAndInchesToCentimeters(double feet2, double inches2) {
        if (feet2 >= 0 && inches2 >= 0 && inches2 < 12) {
            return ((feet2 * 12) * 2.54) + (inches2 * 2.54);
        } else {
            return -1;
        }
    }

    // overloading calcFeetAndInchesToCentimeters()
    // 3rd method, second overloaded
    public double calcFeetAndInchesToCentimeters(double inches3) {
        if (inches3 >= 0) {
            double feet3 = inches3 / 12;
            double remainingInches = inches3 % 12;
            return calcFeetAndInchesToCentimeters(feet3, remainingInches);
        } else {
            return -1;
        }
    }
}
