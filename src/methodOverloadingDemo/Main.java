package methodOverloadingDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creating object of class and using its constructor
        ConversionToCentimeters obj = new ConversionToCentimeters(1, 1);

        // printing output result by calling method
        System.out.println(obj.calcFeetAndInchesToCentimeters());

        // taking user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter foot: ");
        double feet = scan.nextDouble();
        System.out.print("Enter inch: ");
        double inches = scan.nextDouble();

        // calling method with parameters
        System.out.println(obj.calcFeetAndInchesToCentimeters(feet, inches));
    }
}
