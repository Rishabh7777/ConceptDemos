package datatypes;

public class StringDatatype {
    public static void main(String[] args) {

        // String is a class but can be used as datatype
        String str = "Hello";
        System.out.println(str);

        // String needs to be assigned again after operations
        str = str + " World";
        // Strings are immutable, so created again
        System.out.println(str);

        // String can also use unicode characters
        str = str + " \u0918";
        System.out.println(str);

        // adding a number with String
        str = str + 87;
        System.out.println(str);
        // here 87 is converted to String by compiler as added to string

        // adding two number Strings
        String num1 = "56";
        String num2 = "90";
        System.out.println(num1 + num2);
    }
}
