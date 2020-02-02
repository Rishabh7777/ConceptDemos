package recursion;

public class FibonacciSeries {

    private int element1 = 1;
    private int element2 = 1;
    private int element3;

    // defining method to find fibonacci using iteration
    public void printFibonacciSeries(int element) {
        if (element == 1) {
            System.out.print(element1 + "\t");
        } else {
            System.out.print(element1 + "\t");
            System.out.print(element2 + "\t");
            for (int i = 2; i < element; i++) {
                element3 = element1 + element2;
                System.out.print(element3 + "\t");
                element1 = element2;
                element2 = element3;
            }
        }
    }

    // method to print fibonacci using recursion
    public int fibonacciNumber(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }
}
