package methodOverloadingDemo;

public class Main {
    public static void main(String[] args) {

        // creating object of class and using its constructor
        ConversionToCentimeters obj = new ConversionToCentimeters(1, 1);

        // printing output result by calling method
        System.out.println(obj.calcFeetAndInchesToCentimeters());
    }
}
