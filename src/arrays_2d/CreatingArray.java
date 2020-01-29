package arrays_2d;

import java.util.Arrays;

public class CreatingArray {
    public static void main(String[] args) {

        int[][] arr2D = new int[3][];   // initialising only the rows of array

        // initialising different number of columns to each row
        arr2D[0] = new int[5];
        arr2D[1] = new int[2];
        arr2D[2] = new int[4];

        // storing elements in the array
        int count = 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = count;
                count = count + 3;
            }
        }

        // printing the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(arr2D));   // will not work for 2D array, prints hashcode

        int[] arr = new int[3];
        arr[0] = 34;
        arr[1] = 90;
        arr[2] = 34;

        System.out.println(Arrays.toString(arr));   // will work

        // applying linear search in arr
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 34) {
                System.out.println("Element found at " + i + " position.");
                break;  // due to this above line will be printed only once, otherwise twice
            }
        }
    }
}
