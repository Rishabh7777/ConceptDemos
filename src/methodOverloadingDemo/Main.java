package methodOverloadingDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creating object of class and using its constructor
        ConversionToCentimeters obj = new ConversionToCentimeters(4, 3);
        double centimeters3 = obj.calcFeetAndInchesToCentimeters();
        if (centimeters3 < 0.0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(centimeters3);
        }

        // taking user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter foot: ");
        double feet = scan.nextDouble();
        System.out.print("Enter inch: ");
        double inches = scan.nextDouble();

        // calling method with parameters and output
        double centimeters = obj.calcFeetAndInchesToCentimeters(feet, inches);
        if (centimeters < 0.0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
        }

        // calling method with only 1 parameter and printing output
        double centimeters2 = obj.calcFeetAndInchesToCentimeters(inches);
        if (centimeters2 < 0.0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(inches + " inches = " + centimeters + " cm");
        }

    }
}
