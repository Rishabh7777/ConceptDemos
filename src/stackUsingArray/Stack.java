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
            System.out.println("Stack overflow");
        } else {
            arr[top] = element;
            top++;
        }
    }

    // for checking if stack is full or not
    private boolean isFull() {
        return arr.length == maxSize;
    }

    // for removing element from stack
    int pop() {
        int response = -1;
        if (isEmpty()) {
            response = arr[top];
            top--;
        } else {
            System.out.print("Stack underflow" + "\t");
        }
        return response;
    }

    // for checking if stack is empty or not
    private boolean isEmpty() {
        return arr.length == 0;
    }

    // for seeing the top most element of stack
    int seek() {
        if (isFull()) {
            return arr[top - 1];
        } else if (isEmpty()) {
            return -1;
        } else {
            return arr[top];
        }
    }
}
