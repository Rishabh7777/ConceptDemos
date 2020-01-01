package methodOverloadingDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creating object of class and using its constructor
        // calling original method
        ConversionToCentimeters obj = new ConversionToCentimeters(4, 3);
        double centimeters = obj.calcFeetAndInchesToCentimeters();
        if (centimeters < 0.0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(centimeters);
        }

        // taking user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter foot: ");
        double feet = scan.nextDouble();
        System.out.print("Enter inch: ");
        double inches = scan.nextDouble();

        // calling first overloaded method
        double centimeters2 = obj.calcFeetAndInchesToCentimeters(feet, inches);
        if (centimeters2 < 0.0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(feet + " feet " + inches + " inches = " + centimeters2 + " cm");
        }

        // calling second overloaded method
        double centimeters3 = obj.calcFeetAndInchesToCentimeters(inches);
        if (centimeters3 < 0.0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(inches + " inches = " + centimeters3 + " cm");
        }
    }
}
