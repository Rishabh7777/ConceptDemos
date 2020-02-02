package stackUsingArray;

public class Stack {

    private int top;
    private int[] arr;     // array for stack
    private int maxSize;

    // constructor
    public Stack(int sizeOfStack) {
        arr = new int[sizeOfStack];
        top = 0;
        maxSize = sizeOfStack;
    }

    // for inserting new element
    void push(int element) {
        if (!isFull()) {
            arr[top] = element;
            top++;
        } else {
            System.out.println("Stack overflow");
        }
    }

    // for checking if stack is full or not
    private boolean isFull() {
        return arr.length == maxSize;
    }
}
