package methodOverloadingDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // taking user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter feet and inches: ");
        double feet = scan.nextDouble();
        double inches = scan.nextDouble();

        // calling method with two parameters
        double centimeters = CalculateCentimeters.calcFeetAndInchesToCentimeters(feet, inches);
        if (centimeters < 0) {
            System.out.println("Invalid feet/inches value.");
        } else {
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cms");
        }
    }
}
