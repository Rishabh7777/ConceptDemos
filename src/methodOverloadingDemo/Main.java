package methodOverloadingDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // taking user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter feet and inches to convert: ");
        double feet = scan.nextDouble();
        double inches = scan.nextDouble();

        CalculateCentimeters obj = new CalculateCentimeters(45, 10);

        // calling method with two parameters
        double centimeters = obj.calcFeetAndInchesToCentimeters(feet, inches);
        if (centimeters < 0) {
            System.out.println("Invalid feet/inches value.");
        } else {
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cms");
        }

        // taking input second time
        System.out.println("Enter inches to convert: ");
        double inches2 = scan.nextDouble();

        // calling method with one parameter
        double centimeters2 = obj.calcFeetAndInchesToCentimeters(inches);
        if (centimeters < 0) {
            System.out.println("Invalid inches value.");
        } else {
            System.out.println(inches2 + " inches = " + centimeters2 + " cms");
        }

        // calling method which used constructor
        System.out.println(obj.calcFeetAndInchesToCentimeters(2));
    }
}
