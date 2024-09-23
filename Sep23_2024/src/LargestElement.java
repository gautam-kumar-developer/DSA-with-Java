//Problem 2: Calculate the maximum value out of all the elements in the array.

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n]; //array creation
        System.out.print("Enter elements of array: "); //array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // finding max value
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.print("Maximum Element of Array: " + max);
    }
}
