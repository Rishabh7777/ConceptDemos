package methodOverloadingDemo;

public class CalculateCentimeters {

    private double feet;
    private double inches;

    // constructor
    public CalculateCentimeters(double feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    //getters and setters
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

    // method to calculate centimeters from feet and inches
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches < 12) {
            return (((feet * 12) * 2.54) + (inches * 2.54));
        } else {
            return -1;
        }
    }

    // overloading method calcFeetAndInchesToCentimeters()
    public static double calcFeetAndInchesToCentimeters(double inches2) {
        if (inches2 >= 0) {
            double feet2 = (int) inches2 / 12;
            double remainingInches = (int) inches2 % 12;
            System.out.println(feet2);
            System.out.println(remainingInches);
            // calling main method in overloaded one
            return calcFeetAndInchesToCentimeters(feet2, remainingInches);
        } else {
            return -1;
        }
    }

    // method using constructor
    // this method should not be static as it needs to create object
    public double calcFeetAndInchesToCentimeters() {
        return calcFeetAndInchesToCentimeters(getFeet(), inches);
    }
}
