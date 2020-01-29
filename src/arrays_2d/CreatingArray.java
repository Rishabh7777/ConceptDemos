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

        int[] arr = new int[10];
        arr[0] = 34;
        arr[1] = 90;
        arr[2] = 34;
        arr[3] = 12;
        arr[4] = 2;
        arr[5] = 68;
        arr[6] = 45;
        arr[7] = 74;
        arr[8] = 64;
        arr[9] = 3;

        System.out.println(Arrays.toString(arr));   // will work

        // applying linear search in arr
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 34) {
                System.out.println("Element found at " + i + " position.");
                break;  // due to this above line will be printed only once, otherwise twice
            }
        }

        // binary searching
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + end / 2;
            // printing element whenever found
            if (arr[mid] == 34) {
                System.out.println("Element present at " + mid);
                break;
            }
            // otherwise just setting the start and end points again and again
            if (arr[mid] > 34) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
}
