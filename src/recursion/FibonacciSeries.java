package recursion;

public class FibonacciSeries {

    private int element1 = 1;
    private int element2 = 1;
    private int element3;

    // defining method to find fibonacci using iteration
    public void printFibonacciSeries(int element) {
        for (int i = 0; i < element; i++) {
            element3 = element1 + element2;
            System.out.print(element3 + "\t");
            element1 = element2;
            element2 = element3;
        }
    }
}
