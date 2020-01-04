package datatypes;

public class CharAndBoolean {
    public static void main(String[] args) {

        // char
        char charValue = 'G';
        char charValue2 = 'L';
        System.out.println(charValue);
        // adding two char variables
        System.out.println(charValue + charValue2);
        // returns an int value as concatenation is a method in String not for char datatype

        // char using unicode
        // unicode-table.com
        char charUnicodeValue = '\u0918';
        System.out.println(charUnicodeValue);

        // boolean
        boolean booleanValue = true;
        // true in small
        System.out.println(booleanValue);

        // with var compiler automatically determines the type of variable
        var a = "no";
        System.out.println(a);

        int a1 = 6;
        if (a1 == 7) ;
        {
            System.out.println("It works");
        }
    }
}
