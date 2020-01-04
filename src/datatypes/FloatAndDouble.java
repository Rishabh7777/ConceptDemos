package datatypes;

public class FloatAndDouble {
    public static void main(String[] args) {

        // max and min values of float and double
        float maxFloatValue = Float.MAX_VALUE;
        float minFloatValue = Float.MIN_VALUE;
        System.out.println("Float: " + minFloatValue + " , " + maxFloatValue);
        double maxDoubleValue = Double.MAX_VALUE;
        double minDoubleValue = Double.MIN_VALUE;
        System.out.println("Double: " + minDoubleValue + " , " + maxDoubleValue);

        // declaring datatype
        float floatValue1 = 2.456f; // or
        float floatValue2 = (float) 2.456;
        double doubleValue = 5.893d;

        // converting pound to kilogram
        double poundValue = 200d;
        double kilogramValue = 0.45359237 * poundValue;
        System.out.println(poundValue + " pound = " + kilogramValue + " kilogram");

        // using _
        double newDouble = 3_000_365.456_78d;
        float newFloat = 3_000_67.456_78f;
        System.out.println(newDouble + " , " + newFloat);
    }
}
