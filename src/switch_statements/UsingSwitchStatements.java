package switch_statements;

import java.util.Scanner;

public class UsingSwitchStatements {
    public static void main(String[] args) {

        // taking user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a alphabet:");
        char c = scan.next().charAt(0);     // way to take char input, it takes input upto first space only
//        String str = scan.next();       // input using next() stops at space
        System.out.println(c);
//        System.out.println(str);
    }
}
