package recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter element to print fibonacci series: ");
        int element = scan.nextInt();

        FibonacciSeries obj = new FibonacciSeries();
        obj.printFibonacciSeries(element);
        System.out.println();

        System.out.println(obj.fibonacciNumber(element));
    }
}
