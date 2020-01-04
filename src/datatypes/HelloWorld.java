package datatypes;

public class HelloWorld {
    public static void main(String[] args) {

        // printing hello world
        System.out.println("Hello World");

        // some arithmetic operations
        int num1 = (10 + 5) + (2 * 10);
        int num2 = 12;
        int num3 = num1 * 2;
        int total = num1 + num2 + num3;
        System.out.println(total);
        int newNum = total - 1000;
        System.out.println(newNum);

        // using Integer class via two types
        Integer num = new Integer(5);
        System.out.println(num.MAX_VALUE);
        // or
        int num4 = Integer.MAX_VALUE;
        System.out.println(num4);

        // we can concat a string with integer

        // adding a number to maximum int value, it will go in circle
        System.out.println(num4 + 5);

        // printing number with _
        System.out.println(2_147);

        // creating a long variable
        long firstLongValue = 100L;
        System.out.println(firstLongValue);

        // using Byte class
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println(maxByteValue + " , " + minByteValue);
        // (maxByteValue / 2) is treated as an int by default;
        // java uses int by default
        byte newByte = (byte) (maxByteValue / 2);
        System.out.println(newByte);

        // max and min short values
        short maxShortValue = Short.MAX_VALUE;
        short minShortValue = Short.MIN_VALUE;
        System.out.println(maxShortValue + " , " + minShortValue);

        // arithmetic operation with different datatype
        short shortValue = 31652;
        byte byteValue = 109;
        int intValue = 2147483555;
        // didn't need to typecast each shortValue and others as they fit in long
        long longValue = 50000L + (10L * ((long) shortValue + (long) byteValue + (long) intValue));
        System.out.println(longValue);
    }
}
