package switch_statements;

import java.util.Scanner;

public class UsingSwitchStatements {
    public static void main(String[] args) {

        // taking user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a alphabet in uppercase:");
        char c = scan.next().charAt(0);     // way to take char input, it takes input upto first space only
//        String str = scan.next();       // input using next() stops at space
//        System.out.println(c);
//        System.out.println(str);

        // applying switch statements
        switch (c) {
            case 'A':
                System.out.println("A for Apple");
                break;  // it is used to get out of switch block when one case is executed

            case 'B':
                System.out.println("B for Ball");
                break;

            case 'C':
                System.out.println("C for Cat");
                break;

            case 'D':
                System.out.println("D for Dog");
                break;

            case 'E':
                System.out.println("E for Elephant");
                break;

            default:
                System.out.println("Oops! I have not learnt that many.");
        }
    }
}
