package methodOverloadingDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creating object of class and using its constructor
        // calling original method
        ConversionToCentimeters obj = new ConversionToCentimeters(4, 5);
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
        System.out.print("Enter inches: ");
        double inches2 = scan.nextDouble();
        double centimeters3 = obj.calcFeetAndInchesToCentimeters(inches2);
        if (centimeters3 < 0.0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(inches2 + " inches = " + centimeters3 + " cm");
        }
    }
}